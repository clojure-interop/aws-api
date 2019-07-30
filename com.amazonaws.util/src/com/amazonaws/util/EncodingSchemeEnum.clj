(ns com.amazonaws.util.EncodingSchemeEnum
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util EncodingSchemeEnum]))

(def BASE16
  "Enum Constant.

  type: com.amazonaws.util.EncodingSchemeEnum"
  EncodingSchemeEnum/BASE16)

(def BASE32
  "Enum Constant.

  type: com.amazonaws.util.EncodingSchemeEnum"
  EncodingSchemeEnum/BASE32)

(def BASE64
  "Enum Constant.

  type: com.amazonaws.util.EncodingSchemeEnum"
  EncodingSchemeEnum/BASE64)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EncodingSchemeEnum c : EncodingSchemeEnum.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.util.EncodingSchemeEnum[]`"
  ([]
    (EncodingSchemeEnum/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.util.EncodingSchemeEnum`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.util.EncodingSchemeEnum [^java.lang.String name]
    (EncodingSchemeEnum/valueOf name)))

(defn encode-as-string
  "bytes - `byte[]`

  returns: `java.lang.String`"
  (^java.lang.String [^EncodingSchemeEnum this bytes]
    (-> this (.encodeAsString bytes))))

