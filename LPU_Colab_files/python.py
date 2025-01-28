import numpy as np

print("Welcome to The World of Calculations made by Vansh")
print("Choose an operation: 1. Add 2. Subtract 3. Multiply 4. Divide 5. Mod 6. Power 7. Sqrt 8. Sin 9. Log 10. Cos")
c = int(input())

a = int(input("Enter first number: "))
b = int(input("Enter second number: ")) 

if c == 1:
    print(f"The result is: {np.add(a, b)}")
elif c == 2:
    print(f"The result is: {np.subtract(a, b)}")
elif c == 3:
    print(f"The result is: {np.multiply(a, b)}")
elif c == 4:
    print(f"The result is: {np.divide(a, b)}" if b != 0 else "Error: Division by zero")
elif c == 5:
    print(f"The result is: {np.mod(a, b)}")
elif c == 6:
    print(f"The result is: {np.power(a, b)}")
elif c == 7:
    print(f"The result is: {np.sqrt(a)}")
elif c == 8:
    print(f"The result is: {np.sin(a)}")
elif c == 9:
    print(f"The result is: {np.log(a)}")
elif c == 10:
    print(f"The result is: {np.cos(a)}")
else:
    print("Invalid choice")
