def minimumAbsoluteDifference(arr):
    # Write your code here
    mins = []
    arr.sort()
    for i in range(len(arr)-1):
        mins.append(abs(arr[i]-arr[i+1]))
    return min(mins)

print(minimumAbsoluteDifference([40,10,20,3,4,5,1,2]))