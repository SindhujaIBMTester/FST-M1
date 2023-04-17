user1_choice = input("User 1 Choose rock,paper or scissor:")
user2_choice = input("User 2 Choose rock,paper or scissor:")

if user1_choice == user2_choice:
    print("ITs a tie")
elif user1_choice == "paper":
    if user2_choice == 'scissor':
        print("Scissor wins")
    else:
        print("Rock wins")
elif user1_choice == "rock":
    if user2_choice == "scissor":
        print("Rock wins")
    else:
        print("Paper wins")
elif user1_choice == "rock":
    if user2_choice == 'paper':
        print("Paper wins")
    else:
        print("Scissor wins")
else:
    print("Invalid inpt provided")
