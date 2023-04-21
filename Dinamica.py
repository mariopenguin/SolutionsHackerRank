from re import L


def maxSubsetSum(arr,lista,pos):
    if(pos==1 or pos==0):
        arr[pos] = max(0,lista[pos])
        return arr[pos] 
    else:
        maximo= max(max(arr[p-2],arr[p-2]+maxSubsetSum(arr,lista,pos-2)),max(arr[p-3],arr[p-3]+maxSubsetSum(arr,lista,pos-3))) 
        return maximo
        


lista = [1,2,3,4,5,6,7]
p = [0]*len(lista)
print(maxSubsetSum(p,lista,len(lista)-1))
