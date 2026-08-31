animals = ["cat", "dog", "blobfish", "shark", "owl", "toad"]

# define a function that takes in the list above, and an animal 'name' and an argument
# loop through the list to check if it is there
# Print "animal is in the list or animal is not in the List"
# then call the function with the following tests:

def check_animal(name):
    for animal in animals:
        if animal == name:
            print(f"{name} is in the list")
            return
    print(f"{name} is not in the list")

check_animal ("cat")
check_animal ("penguin")