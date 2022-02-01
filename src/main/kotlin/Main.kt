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
            // User to enter Customer (Contact) and Customer Phone # (Phone).
            print("Enter Customer Name: ")
            Contact = readLine()!!.toString()
            print("Enter Customer Phone #: ")
            Phone = readLine()!!.toString()
            Display_Cust_Info(Contact, Phone)
        }
        else if (Selection == 2) {
            // User to enter Business Name (Business), Business Contact (Contact) and Business Phone # (Phone).
            print("Enter Business Name: ")
            Business = readLine()!!.toString()
            print("Enter Business Contact Person: ")
            Contact = readLine()!!.toString()
            print("Enter Business Phone #: ")
            Phone = readLine()!!.toString()
            Display_Cust_Info(Business, Contact, Phone)
        }
        else if (Selection != 3)
            println("Invalid Entry")
        println()

    } while (Selection != 3)

    println("Program arguments: ${args.joinToString()}")
}