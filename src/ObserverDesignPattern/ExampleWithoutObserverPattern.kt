package ObserverDesignPattern

/*
Flaws in below program :-
1.Cricket class have direct refrence to average and current class,it just needs to call update score but due to direct refremces to its object
it can access other elements inside the class which is not secure
2.It violated abstraction
3.Both classes are tightly coupled
4.If some future requirement changes in current and average class,there will lots of changes be made in Cricket class
 */

fun main(args:Array<String>){
    val averageScoreObj = AverageScoreDIsplay()
    val currentScoreObj = CurrentScoreDisplay()
    val cricketDataObj = Cricket(averageScoreObj,currentScoreObj)
    cricketDataObj.dataChanged()
}

class Cricket(val avgObj:AverageScoreDIsplay,val curObj:CurrentScoreDisplay){
    private var runs:Int? = null
    private var wickets:Int? = null
    private var overs:Float? = null

    private fun getLatestRun():Int{
        return 110
    }

    private fun getLatestWicket():Int{
        return 2
    }

    private fun getLatestOvers():Float{
        return 15.3f
    }

    fun dataChanged(){
        runs = getLatestRun()
        wickets = getLatestWicket()
        overs = getLatestOvers()

        runs?.let{
            wickets?.let {
                overs?.let {
                    curObj.update(runs!!,wickets!!,overs!!)
                    avgObj.update(runs!!,wickets!!,overs!!)
                }
            }
        }
    }
}

class AverageScoreDIsplay(){
    var runrate:Float? = null
    var predictedScore:Int? = null

    fun update(runs:Int,wickets:Int,overs:Float){
        runrate = runs/overs
        predictedScore = runrate?.toInt()?.times(50)
        displayScore()
    }

    fun displayScore(){
        println("--Average Score--")
        println("Run Rate: ${runrate}")
        println("Score Predicted: ${predictedScore}")
    }
}

class CurrentScoreDisplay(){
    var runs:Int? = null
    var wickets:Int? = null
    var overs:Float? = null

    fun update(runs:Int,wickets:Int,overs:Float){
        this.runs = runs
        this.overs = overs
        this.wickets = wickets
        displayScore()
    }

    fun displayScore(){
        println("--Current Score--")
        println("Runs: ${runs}")
        println("Wiclets: ${wickets}")
        println("Overs: ${overs}")
        println()
    }
}