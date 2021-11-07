def prime(num):
    #if num has a divisor other than 1 and itself; it is not prime
    for i in range(2, num-1):
        if num % i == 0:
            return False
        
    #all numbers below 2 (including negativ numbers) can not be prime
    if num <= 1:
        return False
    
    #if both statements fail; it is prime
    return True

if __name__ == '__main__':
    num = int(input("Ange ett heltal: "))   #get ui and see if it is prime or not
    if prime(num):
        print(num, "är ett primtal")
    else:
        print(num, "är inte ett primtal")
