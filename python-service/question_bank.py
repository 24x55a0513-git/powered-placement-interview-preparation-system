QUESTION_BANK = {

    "DSA": [
        {
            "question": "What is an array?",
            "difficulty": "Easy",
            "explanation": "An array stores multiple elements of the same type in contiguous memory locations. Elements can be accessed using an index. Accessing an element by index is generally fast.",
            "key_points": [
                "Contiguous memory",
                "Index-based access"
            ]
        },
        {
            "question": "What is the difference between an array and a linked list?",
            "difficulty": "Easy",
            "explanation": "An array stores elements in contiguous memory, while a linked list stores nodes connected using links. Arrays provide fast index access. Linked lists are more flexible for insertion and deletion.",
            "key_points": [
                "Memory organization",
                "Insertion and deletion"
            ]
        },
        {
            "question": "What is binary search?",
            "difficulty": "Medium",
            "explanation": "Binary search finds an element in a sorted collection by repeatedly dividing the search range into two parts. It eliminates half of the remaining elements at each step. Its time complexity is O(log n).",
            "key_points": [
                "Sorted data",
                "O(log n) complexity"
            ]
        },
        {
            "question": "What is the difference between a stack and a queue?",
            "difficulty": "Easy",
            "explanation": "A stack follows the Last In First Out principle. A queue follows the First In First Out principle. They are commonly used for different types of data processing.",
            "key_points": [
                "LIFO",
                "FIFO"
            ]
        },
        {
            "question": "What is the time complexity of linear search?",
            "difficulty": "Easy",
            "explanation": "Linear search checks elements one by one until the required element is found. In the worst case, every element may need to be checked. Therefore, its worst-case time complexity is O(n).",
            "key_points": [
                "Sequential search",
                "O(n) complexity"
            ]
        }
    ],

    "SQL": [
        {
            "question": "What is the difference between WHERE and HAVING?",
            "difficulty": "Medium",
            "explanation": "WHERE filters rows before grouping takes place. HAVING filters groups after GROUP BY is applied. HAVING is commonly used with aggregate functions.",
            "key_points": [
                "WHERE filters rows",
                "HAVING filters groups"
            ]
        },
        {
            "question": "What is a primary key?",
            "difficulty": "Easy",
            "explanation": "A primary key uniquely identifies each row in a table. It cannot contain duplicate values. A primary key also cannot normally contain NULL values.",
            "key_points": [
                "Unique identification",
                "No duplicate values"
            ]
        },
        {
            "question": "What is a JOIN in SQL?",
            "difficulty": "Easy",
            "explanation": "A JOIN combines related data from two or more tables. Tables are connected using related columns. Different JOIN types provide different results.",
            "key_points": [
                "Combines tables",
                "Uses related columns"
            ]
        },
        {
            "question": "What is the difference between DELETE and TRUNCATE?",
            "difficulty": "Medium",
            "explanation": "DELETE removes selected rows and can use a WHERE condition. TRUNCATE removes all rows from a table. TRUNCATE is generally used when the entire table data needs to be removed.",
            "key_points": [
                "DELETE can filter rows",
                "TRUNCATE removes all rows"
            ]
        },
        {
            "question": "What is normalization in databases?",
            "difficulty": "Medium",
            "explanation": "Normalization organizes database data to reduce unnecessary duplication. It divides data into related tables using appropriate relationships. This helps maintain data consistency.",
            "key_points": [
                "Reduce redundancy",
                "Improve consistency"
            ]
        }
    ],

    "Python": [
        {
            "question": "What is the difference between a list and a tuple in Python?",
            "difficulty": "Easy",
            "explanation": "A list is mutable, which means its elements can be changed after creation. A tuple is immutable. Tuples are useful when the data should not be modified.",
            "key_points": [
                "List is mutable",
                "Tuple is immutable"
            ]
        },
        {
            "question": "What is a dictionary in Python?",
            "difficulty": "Easy",
            "explanation": "A dictionary stores data as key-value pairs. Each key is used to access its associated value. Dictionaries are useful for representing structured information.",
            "key_points": [
                "Key-value pairs",
                "Fast lookup"
            ]
        },
        {
            "question": "What is a function in Python?",
            "difficulty": "Easy",
            "explanation": "A function is a reusable block of code designed to perform a specific task. Functions can accept input through parameters and return a result. They help organize and reuse code.",
            "key_points": [
                "Code reuse",
                "Parameters and return values"
            ]
        },
        {
            "question": "What is exception handling in Python?",
            "difficulty": "Medium",
            "explanation": "Exception handling allows a program to deal with runtime errors without immediately terminating. Python commonly uses try and except blocks for this purpose. finally can be used for cleanup operations.",
            "key_points": [
                "try and except",
                "Handle runtime errors"
            ]
        },
        {
            "question": "What is object-oriented programming in Python?",
            "difficulty": "Medium",
            "explanation": "Object-oriented programming organizes software using classes and objects. It supports concepts such as inheritance, encapsulation and polymorphism. These concepts help structure larger programs.",
            "key_points": [
                "Classes and objects",
                "OOP principles"
            ]
        }
    ],

    "Java": [
        {
            "question": "What is a class in Java?",
            "difficulty": "Easy",
            "explanation": "A class is a blueprint used to create objects. It can contain variables and methods. Objects created from the class represent individual instances.",
            "key_points": [
                "Blueprint",
                "Objects"
            ]
        },
        {
            "question": "What is inheritance in Java?",
            "difficulty": "Easy",
            "explanation": "Inheritance allows one class to acquire properties and methods from another class. It supports code reuse. Java commonly uses the extends keyword for class inheritance.",
            "key_points": [
                "Code reuse",
                "extends keyword"
            ]
        },
        {
            "question": "What is method overloading?",
            "difficulty": "Medium",
            "explanation": "Method overloading means having multiple methods with the same name but different parameter lists. It is an example of compile-time polymorphism. The compiler determines which method should be called.",
            "key_points": [
                "Same method name",
                "Different parameters"
            ]
        },
        {
            "question": "What is method overriding?",
            "difficulty": "Medium",
            "explanation": "Method overriding occurs when a subclass provides its own implementation of a method inherited from a parent class. It is associated with runtime polymorphism. The method signature must match the inherited method.",
            "key_points": [
                "Subclass implementation",
                "Runtime polymorphism"
            ]
        },
        {
            "question": "What is encapsulation?",
            "difficulty": "Easy",
            "explanation": "Encapsulation combines data and methods within a class while controlling access to the internal data. Access modifiers are commonly used for this purpose. It helps protect the state of an object.",
            "key_points": [
                "Data protection",
                "Access modifiers"
            ]
        }
    ],

    "OOP": [
        {
            "question": "What are the four main principles of OOP?",
            "difficulty": "Easy",
            "explanation": "The four main principles are encapsulation, inheritance, polymorphism and abstraction. These principles help organize software around objects. They also support reuse and maintainability.",
            "key_points": [
                "Four OOP principles",
                "Code organization"
            ]
        },
        {
            "question": "What is abstraction?",
            "difficulty": "Easy",
            "explanation": "Abstraction hides unnecessary implementation details and exposes only the required functionality. It allows users to focus on what an object does rather than how it works. Abstract classes and interfaces can support abstraction.",
            "key_points": [
                "Hide implementation details",
                "Expose essential functionality"
            ]
        },
        {
            "question": "What is polymorphism?",
            "difficulty": "Medium",
            "explanation": "Polymorphism allows the same interface or method concept to behave differently depending on the object or context. Method overloading and overriding are common examples. It improves flexibility in object-oriented programs.",
            "key_points": [
                "Multiple behaviors",
                "Overloading and overriding"
            ]
        }
    ],

    "NumPy": [
        {
            "question": "What is NumPy?",
            "difficulty": "Easy",
            "explanation": "NumPy is a Python library used for numerical computing. It provides multidimensional arrays and mathematical operations. NumPy is commonly used for efficient numerical data processing.",
            "key_points": [
                "Numerical computing",
                "Multidimensional arrays"
            ]
        },
        {
            "question": "What is a NumPy array?",
            "difficulty": "Easy",
            "explanation": "A NumPy array is a multidimensional data structure provided by NumPy. It stores elements efficiently and supports mathematical operations. Arrays are commonly used in data analysis and machine learning.",
            "key_points": [
                "Multidimensional structure",
                "Numerical operations"
            ]
        },
        {
            "question": "What is array slicing in NumPy?",
            "difficulty": "Medium",
            "explanation": "Array slicing is used to select a portion of an array. It can be performed using start, stop and step values. Slicing is useful for accessing specific sections of data.",
            "key_points": [
                "Select array portions",
                "Start, stop and step"
            ]
        }
    ],

    "Pandas": [
        {
            "question": "What is Pandas in Python?",
            "difficulty": "Easy",
            "explanation": "Pandas is a Python library designed for data manipulation and analysis. It provides structures such as Series and DataFrame. It is widely used for working with structured datasets.",
            "key_points": [
                "Data analysis",
                "DataFrame"
            ]
        },
        {
            "question": "What is a DataFrame?",
            "difficulty": "Easy",
            "explanation": "A DataFrame is a two-dimensional data structure provided by Pandas. It contains rows and columns similar to a database table. It supports filtering, grouping and data manipulation.",
            "key_points": [
                "Rows and columns",
                "Data manipulation"
            ]
        },
        {
            "question": "How can you filter data in a Pandas DataFrame?",
            "difficulty": "Medium",
            "explanation": "DataFrame rows can be filtered using conditions on one or more columns. Boolean conditions are commonly used for this purpose. Filtering helps select only the records required for analysis.",
            "key_points": [
                "Boolean conditions",
                "Select required records"
            ]
        }
    ]
}
import random


def get_random_questions(weak_skills, count=4):

    available_questions = []

    for skill in weak_skills:
        if skill in QUESTION_BANK:
            for question in QUESTION_BANK[skill]:
                question_copy = question.copy()
                question_copy["skill"] = skill
                available_questions.append(question_copy)

    if not available_questions:
        return []

    return random.sample(
        available_questions,
        min(count, len(available_questions))
    )