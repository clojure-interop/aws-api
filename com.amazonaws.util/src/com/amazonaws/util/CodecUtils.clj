(ns com.amazonaws.util.CodecUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util CodecUtils]))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (CodecUtils c : CodecUtils.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.util.CodecUtils[]`"
  ([]
    (CodecUtils/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.util.CodecUtils`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.util.CodecUtils [^java.lang.String name]
    (CodecUtils/valueOf name)))

(defn *to-bytes-direct
  "Returns a byte array representing the given string,
   truncating each character into a byte directly.

  single-octets - `java.lang.String`

  returns: `byte[]`

  throws: java.lang.IllegalArgumentException - if the input string contains any multi-octet character"
  ([^java.lang.String single-octets]
    (CodecUtils/toBytesDirect single-octets)))

(defn *to-string-direct
  "Returns a string representing the given byte array,
   treating each byte as a single octet character.

  bytes - `byte[]`

  returns: `java.lang.String`"
  (^java.lang.String [bytes]
    (CodecUtils/toStringDirect bytes)))

