(ns com.amazonaws.util.Base32
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util Base32]))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Base32 c : Base32.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.util.Base32[]`"
  ([]
    (Base32/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.util.Base32`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.util.Base32 [^java.lang.String name]
    (Base32/valueOf name)))

(defn *encode-as-string
  "Returns a base 32 encoded string of the given bytes.

  bytes - `byte`

  returns: `java.lang.String`"
  (^java.lang.String [^Byte bytes]
    (Base32/encodeAsString bytes)))

(defn *encode
  "Returns a 32 encoded byte array of the given bytes.

  bytes - `byte[]`

  returns: `byte[]`"
  ([bytes]
    (Base32/encode bytes)))

(defn *decode
  "Decodes the given base 32 encoded string,
   skipping carriage returns, line feeds and spaces as needed.

  b-32 - `java.lang.String`

  returns: `byte[]`"
  ([^java.lang.String b-32]
    (Base32/decode b-32)))

