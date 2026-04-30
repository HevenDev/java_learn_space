# Static keyword makes instance variable or instance method shared by all the object that will create, and it reflect to all the object even when changing it's value.
# It should not access by the object specifically, it should access in the static way. Like with the name of the class itself,
# for non static variable inside the method we need to pass the object to the static method to refer it.

refer to StaticKeyword.java

static block is there to get the value assign of statics only once.
static block execute first, class load first so static block with the class   
# static{}

If obj is not created static also not load, for that need to use Class.forName thing