import kotlin.random.Random;



fun main(args: Array<String>) {

    // create & fill-completion
    val numbers = Array(20){Random.nextInt(99)};

    // sort-ing
    val sortedArray = numbers.sortedArray();

    // print
    println(sortedArray.joinToString(", "));
}