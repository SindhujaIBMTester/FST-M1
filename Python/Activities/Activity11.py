fruits = { "Apple" : "100","Banana" :  "50", "Orange" : "200"}
user_fruit = input("Enter the fruit name:")
if(user_fruit in fruits):
    print("Fruit is present")
else:
    print("Fruit is not present")