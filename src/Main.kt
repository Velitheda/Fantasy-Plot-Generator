fun main(args: Array<String>) {
    println(randomPlot())
}

fun adjective(): String = randomElement(arrayOf("happy", "blue", "green", "golden", "wondrous", "wet",
        "slippery", "cold", "lukewarm", "soft"))

fun quirk() = randomElement(arrayOf("vain", "ignorant", "naive", "needy", "heart-broken", "murderous", "vengeful",
        "peaceful", "love-sick", "tormented", "bold", "loud", "quaint", "tired", "silly", "scarred", "homeless",
        "hallucinating"))

fun being() = randomElement(arrayOf("girl", "boy", "rat", "lizard", "orc", "elf", "human", "dwarf", "fairy", "pixie",
        "vampire", "undead solider", "warrior", "hunter", "blacksmith", "king", "princess", "monk", "prophet", "wizard",
        "witch", "goblin", "stranger", "peasant", "knight", "mailman", "farmer", "scoundrel", "traitor", "detective"))

fun item(): String = randomElement(arrayOf("lemon", "nail", "bunny rabbit", "wolverine", "child", "dragon", "towel", "spade",
        "dress", "candle", "map", "compass", "chair", "bowl", "sugar cube", "rasin", "lily", "herb", "tombstone",
        "crown", "potion", "zebra", "snake", "cake", "loaf of bread", "throne"))

fun disaster(): String = randomElement(arrayOf("civil war", "poisoning", "political conspiracy",
        "disaster", "famine", "war", "deadly plague", "invasion", "earthquake"))

fun descriptor(): String = randomElement(arrayOf("devastating", "crafty", "shocking", "preventable", "cold-hearted",
        "foreshadowed", "prophesied", "sunrising"))

fun twist(): String = randomElement(arrayOf("betrayal", "resurrection", "revelation", "confession", "flashback",
        "discovery", "death", "case of mistaken identity", "defeat", "injury", "irreversible magic spell", "lie",
        "prophecy", "murder", "fatal illness", "fatal injury", "case of amnesia", "theft"))


fun <T>randomElement(array: Array<T>): T {
    val randomIndex: Int = (Math.random() * array.size).toInt()
    return array.elementAt(randomIndex)
}

fun randomPlot(): String {
    val world  = "a ${adjective()} realm"
    val character = "a ${adjective()} ${quirk()} ${being()}"
    val quest = "embark on a quest"
    val questItem = "a ${adjective()} ${item()}"
    val impendingDisaster = "the threat of an imminent ${disaster()}"
    val twist = "a ${descriptor()} ${twist()}"
    val BenignObject = item()

    return "In $world, $character must $quest to retreive $questItem in order to" +
            " save their kingdom from $impendingDisaster. At a pivotal moment, $twist will occur. " +
            "A $BenignObject will keep showing up at odd times."
}