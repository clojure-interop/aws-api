(ns com.amazonaws.auth.SigningAlgorithm
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth SigningAlgorithm]))

(def HmacSHA1
  "Enum Constant.

  type: com.amazonaws.auth.SigningAlgorithm"
  SigningAlgorithm/HmacSHA1)

(def HmacSHA256
  "Enum Constant.

  type: com.amazonaws.auth.SigningAlgorithm"
  SigningAlgorithm/HmacSHA256)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SigningAlgorithm c : SigningAlgorithm.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.auth.SigningAlgorithm[]`"
  ([]
    (SigningAlgorithm/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.auth.SigningAlgorithm`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.auth.SigningAlgorithm [^java.lang.String name]
    (SigningAlgorithm/valueOf name)))

(defn get-mac
  "Returns the thread local reference for the crypto algorithm

  returns: `javax.crypto.Mac`"
  (^javax.crypto.Mac [^SigningAlgorithm this]
    (-> this (.getMac))))

