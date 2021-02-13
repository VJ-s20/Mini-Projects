import random


number_of_guess=0
name=input("Enter your name:")
while True:
    print("enter 0 to exit")
    guess_number=random.randint(1,5)
    
    user=input("Enter guess:")
    try:
        if user.isdigit:
            user=int(user)
        else:
            raise ValueError
    except ValueError:
        print("Enter a numeber a number in between 1 to 5, Try again")
    number_of_guess+=1
    if user==0:
        print("quiting.....")
        exit()
    elif guess_number==user:
        print("You guessed it right")
        break
    else :
        print("\tThe number was",guess_number,"try again!")
print("number of guess :",number_of_guess)

with open("highscore.txt") as f:
    high_score =f.readline()

if int(high_score)>number_of_guess:
    with open("highscore.txt","w")as f:
        print("You just broke the Highscore!")
        f.write(f" {number_of_guess}")
        # saving your
else:
    with open("records.txt","a")as f:
        print("your score is saved")

        f.write(f"{name}-{number_of_guess} guess\n")

