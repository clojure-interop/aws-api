(ns com.amazonaws.util.Base16Lower
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util Base16Lower]))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Base16Lower c : Base16Lower.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.util.Base16Lower[]`"
  ([]
    (Base16Lower/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.util.Base16Lower`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.util.Base16Lower [^java.lang.String name]
    (Base16Lower/valueOf name)))

(defn *encode-as-string
  "Returns a base 16 encoded string (in lower case) of the given bytes.

  bytes - `byte`

  returns: `java.lang.String`"
  (^java.lang.String [^Byte bytes]
    (Base16Lower/encodeAsString bytes)))

(defn *encode
  "Returns a base 16 encoded byte array of the given bytes.

  bytes - `byte[]`

  returns: `byte[]`"
  ([bytes]
    (Base16Lower/encode bytes)))

(defn *decode
  "Decodes the given base 16 encoded string,
   skipping carriage returns, line feeds and spaces as needed.

  b-16 - `java.lang.String`

  returns: `byte[]`"
  ([^java.lang.String b-16]
    (Base16Lower/decode b-16)))

