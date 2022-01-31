fun Display_Cust_Info(Contact: String, Phone: String) {
    // Display Residential Customer Information
    println("Residential Customer: $Contact")
    println("Phone: $Phone")
    return
}

fun Display_Cust_Info(Business: String, Contact: String, Phone: String) {
    // Display Business Customer Information
    println("Business Name: $Business")
    println("Contact: $Contact")
    println("Phone: $Phone")
    return
}

fun main(args: Array<String>) {
    // Overloaded Functions assignment, due 07-Feb-2022
    var Selection: Int
    var Business = "x"
    var Contact = "x"
    var Phone = "x"

    do {
        // Allow User to select Residential or Business Customer Data Entry
        println("Select: Residential Customer Entry ('1'), Business Customer Entry ('2'), or Exit ('3')")
        print("Enter option (1 ... 3): ")
        Selection = readLine()!!.toInt()

        if (Selection == 1) {
            Contact = "Al"
            Phone = "123-4567"
            Display_Cust_Info(Contact, Phone)
        }

    } while (Selection != 3)

    println("Program arguments: ${args.joinToString()}")

}