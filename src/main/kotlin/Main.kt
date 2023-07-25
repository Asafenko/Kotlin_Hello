

fun displayUser(name:String="NoName", age:Int=19, position:String="unemployed"):Unit{
    println("Name:$name Age:$age Position:$position");
}

// :int , return ?
// :Unit - Void
fun sum(vararg number:Int):Int{
    var result = 0;
    for(n in number){
        result+=n;
    }
    println("SUM: $result");
    return result;
}

fun square(x:Int)=x*x;

fun main(args: Array<String>) {
    /*println("Hello World!")
    // type
    var x: Int = 1;
    var x2: Double = 1.1;

    // no type
    var y = 2;
    var y2 = 2.2;

    // string
    var str = "qwerty";
    str.length;

    // const
    val c = 22;

    // while
    var a = 10;
    var i = 1;
    while(i<10){
        var b = a/i;
        println("B= $b");
        i++;
    }
    // array
    val names = arrayOf("Tobi","Tonia","Timi");
    println(names[0]);
    println(names.get(1));
    println(names.size);
    println(names.count());

    // range
    var range = 1..5;
    var range2 = 5 downTo 1;
    var range3 = 1 .. 10 step 2;
    var range4 = 2 downTo 10 step 3;
    var range5 = 1 until 14;

    // input output print
    println("entre name");
    val name = readLine();
    println("Name: $name")
 */

    // fun-Display
    displayUser();
    displayUser("Jack",23,"married");

    // fun-SUM
    sum(4,3,1,5,2);

    // fun-square
    println(square(5));

    //fun2
    val message:(String,Int,String)->Unit;
    message=::displayUser;
    message("Bred",22,"");
    println(message);
}