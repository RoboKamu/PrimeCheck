def main(num):
    #loop through all number up to the input to see if any of them equal the input
    numList = [x for x in range(num)]
    for i in range(1, num):
        for n in range(1, num - 1):
            if i * numList[n] == num:
                return 1                #if 2 numbers multiply to input, then its not a prime


if __name__ == '__main__':
    num = int(input("Ange ett heltal: "))
    if main(num) == None:
        print(num, "är ett primtal")
    else:
        print(num, "är inte ett primtal")

