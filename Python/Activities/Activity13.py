# Define the list of numbers
numList = [10,20,30,40,50]

# Call the sum() function with numList as argument
def calculate_sum(numbers):
    sum = 0
    for n in numbers:
        sum = sum + n
    return sum

result = str(calculate_sum(numList))
print("The sum of number from list is:"+result)
