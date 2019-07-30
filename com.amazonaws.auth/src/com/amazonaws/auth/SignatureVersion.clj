(ns com.amazonaws.auth.SignatureVersion
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth SignatureVersion]))

(def V1
  "Enum Constant.

  type: com.amazonaws.auth.SignatureVersion"
  SignatureVersion/V1)

(def V2
  "Enum Constant.

  type: com.amazonaws.auth.SignatureVersion"
  SignatureVersion/V2)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SignatureVersion c : SignatureVersion.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.auth.SignatureVersion[]`"
  ([]
    (SignatureVersion/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.auth.SignatureVersion`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.auth.SignatureVersion [^java.lang.String name]
    (SignatureVersion/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SignatureVersion this]
    (-> this (.toString))))

