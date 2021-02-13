import random



print("Rock, Paper and Scissor Game")
def gamewin(comp,you):
    if comp==you:
        return None
    elif comp=="R":
        if you=="P":
            return True
        else:
            return False
    elif comp=="P":
        if you=="S":
            return True
        else:
            return False
    elif comp=="S":
        if you=="R":
            return True
        else:
            return False
    

possibilites=("R","P","S")
if __name__ == "__main__":
    n=1
    user=0
    computer=0
    rounds=int(input("How may rounds would you like to play?\n->"))
    while n<=rounds:
        you=input("your turn: select Rock-(R),Paper-(P),Scisor-(S)?:\n-> ")
        comp=random.choice(possibilites)
        print("Computer decided:")
        gw=gamewin(comp,you.upper())
        print(f"computer Choose-{comp}")
        print(f"you Choose-{you}")
        if gw==None:
            print('Game Tie ,round',n)
        elif gw:
            user+=1
            print('You Won,round',n)
        else:
            computer+=1
            print('You Loss,round',n)
        n+=1
  
    if computer>user:
        print("\tcomputer won the game")
    elif user>computer:
        print("\tyou won the game")
    else:
        print("\tgame draw")



