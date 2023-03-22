# shuffle.py
from random import randrange

def shuffle(myList):
   i = 0
   while(i< len(myList)):
       index = randrange(0,len(myList)) 
       x = myList[i]
       myList.remove(x)
       myList.insert(index,x)
       i = i+1
   return myList
       
    






def main():
    list1 = ["Ace",1,2,3,4,5,6,7,8,9,10,"Jack","Queen","King"]
    print("The deck is: ",list1)
    shuffle(list1)
    print("The deck has been shuffled to: ",list1)
    




main()