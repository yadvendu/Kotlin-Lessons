package ObserverDesignPattern

/*
Points to understand:-
1.The Observer Pattern defines a one to many dependency between objects so that one object changes state, all of its dependents are notified and updated automatically
2.One to many dependency is between Subject(One) and Observer(Many)
3.There is dependency as Observers themselves don’t have access to data. They are dependent on Subject to provide them data.
4.Observer and Subject are interfaces
5.All observers who need the data need to implement observer interface
6.notify() method in observer interface defines the action to be taken when the subject provides it data.
7.The subject maintains an observerCollection which is simply the list of currently registered(subscribed) observers
8.registerObserver(observer) and unregisterObserver(observer) are methods to add and remove observers respectively.
9.notifyObservers() is called when the data is changed and the observers need to be supplied with new data.
 */

/*
Blue Print of both the interfaces:-

interface Observer{
    fun notify()
}

interface Subject{
    observerCollection
    fun registeredObserver(observer: Observer)
    fun unregisteredObsrevre(observer: Observer)
    fun notifyObserver()
}
 */

fun main(args:Array<String>){
    val avgObj = NewAverageScore()
    val curObj = NewCurrentScore()
    val crickObj = NewCricketData()

    crickObj.registerObserver(avgObj)
    crickObj.registerObserver(curObj)
    crickObj.dataChanged()

    crickObj.unregisteredObserver(avgObj)
    crickObj.dataChanged()
    crickObj.registerObserver(avgObj)
    crickObj.dataChanged()
}

interface Subject{
    fun registerObserver(o:Observer)
    fun unregisteredObserver(o:Observer)
    fun notifyObserver()
}

interface Observer{
    fun update(runs:Int,wickets:Int,overs:Float)
}

class NewCricketData():Subject{
    var listOfObservers:MutableList<Observer>
    private var runs:Int? = null
    private var wickets:Int? = null
    private var overs:Float? = null

    init {
        listOfObservers = mutableListOf()
    }


    override fun registerObserver(o: Observer) {
        listOfObservers.add(o)
    }

    override fun unregisteredObserver(o: Observer) {
        listOfObservers.remove(o)
    }

    override fun notifyObserver() {
        for (observers in listOfObservers){
            runs?.let{
                wickets?.let {
                    overs?.let {
                        observers.update(runs!!,wickets!!,overs!!)
                    }
                }
            }
        }
    }

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

        notifyObserver()
    }
}

class NewAverageScore():Observer{
    var runrate:Float? = null
    var predictedScore:Int? = null

    override fun update(runs: Int, wickets: Int, overs: Float) {
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

class NewCurrentScore():Observer{
    var runs:Int? = null
    var wickets:Int? = null
    var overs:Float? = null

    override fun update(runs: Int, wickets: Int, overs: Float) {
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



