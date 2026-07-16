function Bank() {
    let balance = 0;

    function deposit(x){
        balance += x;
        console.log("After Deposit: " + balance);
    }

    function withdraw(x){
        if(x <= balance){
            balance -= x;
            console.log("After Withdraw: " + balance);
        } else {
            console.log("Insufficient balance");
        }
    }

    function getbalance(x){
        return balance
    }

    return {deposit, withdraw, getbalance}
}

let account1 = Bank();
account1.deposit(1000);
account1.withdraw(100);
console.log(account1.getbalance());