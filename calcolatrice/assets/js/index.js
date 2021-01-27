var num = "";
var num1;
var op;

function getNum(e){
    num += e.innerHTML;
}

function getOp(e){
    op = e.innerHTML;
    num1 = num;
    num = "";
}

function calc(){
    const lab = document.getElementsByTagName("label");
    let res;
    if(op == "+"){
         res = parseInt(num1) + parseInt(num);
    }
    if(op == "-"){
         res = parseInt(num1) - parseInt(num);
    }
    if(op == "/"){
         res = parseInt(num1) / parseInt(num);
    }
    if(op == "*"){
         res = parseInt(num1) * parseInt(num);
    }

    lab[0].innerHTML = res;
    num = res;
}

function canc(){
    num = "";
}

function del(){
    num = num.substring(0, num.length - 1);
}
