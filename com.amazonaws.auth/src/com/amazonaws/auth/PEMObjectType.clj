(ns com.amazonaws.auth.PEMObjectType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth PEMObjectType]))

(def PRIVATE_KEY_PKCS1
  "Enum Constant.

  type: com.amazonaws.auth.PEMObjectType"
  PEMObjectType/PRIVATE_KEY_PKCS1)

(def PRIVATE_KEY_PKCS8
  "Enum Constant.

  type: com.amazonaws.auth.PEMObjectType"
  PEMObjectType/PRIVATE_KEY_PKCS8)

(def PUBLIC_KEY_X509
  "Enum Constant.

  type: com.amazonaws.auth.PEMObjectType"
  PEMObjectType/PUBLIC_KEY_X509)

(def CERTIFICATE_X509
  "Enum Constant.

  type: com.amazonaws.auth.PEMObjectType"
  PEMObjectType/CERTIFICATE_X509)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (PEMObjectType c : PEMObjectType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.auth.PEMObjectType[]`"
  ([]
    (PEMObjectType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.auth.PEMObjectType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.auth.PEMObjectType [^java.lang.String name]
    (PEMObjectType/valueOf name)))

(defn *from-begin-marker
  "begin-marker - `java.lang.String`

  returns: `com.amazonaws.auth.PEMObjectType`"
  (^com.amazonaws.auth.PEMObjectType [^java.lang.String begin-marker]
    (PEMObjectType/fromBeginMarker begin-marker)))

(defn get-begin-marker
  "returns: `java.lang.String`"
  (^java.lang.String [^PEMObjectType this]
    (-> this (.getBeginMarker))))

