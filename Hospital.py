def medical_expert_system():
    print("Welcome to the Medical Expert System")
    
    fever = input("Do you have fever? (yes/no): ").lower()
    cough = input("Do you have cough? (yes/no): ").lower()
    sore_throat = input("Do you have sore throat? (yes/no): ").lower()
    body_pain = input("Do you have body pain? (yes/no): ").lower()
    headache = input("Do you have headache? (yes/no): ").lower()

    # Rule-based diagnosis
    if fever == "yes" and cough == "yes" and sore_throat == "yes":
        print("You might have the flu.")
    elif fever == "yes" and body_pain == "yes":
        print("You might have dengue. Please consult a doctor.")
    elif cough == "yes" and sore_throat == "yes" and headache == "yes":
        print("You might have a common cold.")
    else:
        print("Symptoms unclear. Please consult a doctor for proper diagnosis.")

# Run the system
medical_expert_system()