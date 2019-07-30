(ns com.amazonaws.util.Classes
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util Classes]))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Classes c : Classes.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.util.Classes[]`"
  ([]
    (Classes/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.util.Classes`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.util.Classes [^java.lang.String name]
    (Classes/valueOf name)))

(defn *child-class-of
  "Returns the class of the immediate subclass of the given parent class for
   the given object instance; or null if such immediate subclass cannot be
   uniquely identified for the given object instance.

  parent-class - the parent class. The child class is Object if and only if the parent class is null. - `java.lang.Class`
  instance - the given object instance - `java.lang.Object`

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^java.lang.Class parent-class ^java.lang.Object instance]
    (Classes/childClassOf parent-class instance)))

(defn *jar-file-of
  "Returns the jar file from which the given class is loaded; or null
   if no such jar file can be located.

  klass - `java.lang.Class`

  returns: `java.util.jar.JarFile`"
  (^java.util.jar.JarFile [^java.lang.Class klass]
    (Classes/jarFileOf klass)))

