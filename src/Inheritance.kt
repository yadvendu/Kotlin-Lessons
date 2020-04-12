fun main(args:Array<String>){
    var obj = SavingAccount("Prateek","SBI0009876981",5)
    obj.depositMoney(5000)
    obj.withdrawMoney(1500)
    obj.interestRate()
    obj.printAccountDetail()

    
}
open class BankAccount(val name:String,val accountNumber:String){
    var totalAmount:Int = 0

    open fun name(){
        println("Inside Bank account")
    }

    fun depositMoney(amount:Int){
        if(amount > 0){
            totalAmount = totalAmount + amount
        }
    }

    fun withdrawMoney(amount: Int){
        if (amount > 0){
            totalAmount = totalAmount - amount
        }
    }
}

class SavingAccount(name: String,accountNumber: String,val interestRate:Int):BankAccount(name, accountNumber){
    var totalInterest:Int = 0
    fun interestRate(){
        totalInterest = totalAmount * interestRate / 100
    }

    fun printAccountDetail(){
        println("Bank Holder's Name: $name")
        println("Bank Holder's Account Number: $accountNumber")
        println("Total money in the account: $totalAmount")
        println("Total interest from the bank: $totalInterest")

    }

    override fun name() {
       // super.name()
        println("Inside Saving Account")
    }
}