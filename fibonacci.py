from time import time


n = 20
numCalc = 15


def fibonacci(num):
    if num <= 1:
        return num
    else:
        return fibonacci(n-1) + fibonacci(n-2)

def fibCrunch(i):
    initialTime = time()
    
    answer = fibonacci(n)

    endTime = time()

    totalTime = endTime - initialTime

    print("Iteration {} runtime: {}".format(i,totalTime))

    return totalTime


def main():
    

    result = 0

    mean = 0

    lab = raw_input("Please enter the lab: ")

    computer = raw_input("\nPlease enter the computer number: ")

    print("\nFibonacci {} = 1836311903\n".format(n))

    try:
        f = open("Lab_{}_Comp_{}.txt".format(lab,computer),"w")
        f.write("Lab: {}\tComputer Number: {}\n".format(lab,computer))
        for it in range(0,numCalc):
            result = fibCrunch(it)
            f.write("Runtime {}:\t{}\n".format(it+1,result))
            mean += result
        print("Mean:\t\t\t{} nanoseconds".format(mean/numCalc))
        f.write("Mean:\t\t{} nanoseconds\n".format(mean/numCalc))
    except IOError:
        print("An error occured trying to read the file.")
    


main()



