def prime(num):
    # make a list up to num
    numList = [x for x in range(num)]
    # loop through all number up to the input to see if any of them equal the input
    for i in range(1, num-1):
        for n in range(1, num - 1):
            if i * numList[n] == num:
                # if 2 numbers multiply to input, then its not a prime
                return False
    # 1 is an exception
    if num == 1:
        return True
    
    return True


if __name__ == '__main__':
    num = int(input("Ange ett heltal: "))
    # if main(num) returns True; it is prime, otherwise it is not.
    if prime(num):
        print(num, "är ett primtal")
    else:
        print(num, "är inte ett primtal")
