(ns com.amazonaws.util.JodaTime
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util JodaTime]))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (JodaTime c : JodaTime.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.util.JodaTime[]`"
  ([]
    (JodaTime/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.util.JodaTime`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.util.JodaTime [^java.lang.String name]
    (JodaTime/valueOf name)))

(defn *get-version
  "Returns the current version of joda-time used during runtime; or null
   if it cannot be determined.

  returns: `java.lang.String`"
  (^java.lang.String []
    (JodaTime/getVersion )))

(defn *has-expected-behavior?
  "Returns true if the current version of joda-time used during runtime
   behaves as expected by the Java SDK; false otherwise.

  returns: `boolean`"
  (^Boolean []
    (JodaTime/hasExpectedBehavior )))

