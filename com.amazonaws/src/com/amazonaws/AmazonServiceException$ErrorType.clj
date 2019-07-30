(ns com.amazonaws.AmazonServiceException$ErrorType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws AmazonServiceException$ErrorType]))

(def Client
  "Enum Constant.

  type: com.amazonaws.AmazonServiceException$ErrorType"
  AmazonServiceException$ErrorType/Client)

(def Service
  "Enum Constant.

  type: com.amazonaws.AmazonServiceException$ErrorType"
  AmazonServiceException$ErrorType/Service)

(def Unknown
  "Enum Constant.

  type: com.amazonaws.AmazonServiceException$ErrorType"
  AmazonServiceException$ErrorType/Unknown)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (AmazonServiceException.ErrorType c : AmazonServiceException.ErrorType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.AmazonServiceException$ErrorType[]`"
  ([]
    (AmazonServiceException$ErrorType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.AmazonServiceException$ErrorType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.AmazonServiceException$ErrorType [^java.lang.String name]
    (AmazonServiceException$ErrorType/valueOf name)))

