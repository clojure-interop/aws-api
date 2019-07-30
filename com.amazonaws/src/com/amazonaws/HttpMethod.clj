(ns com.amazonaws.HttpMethod
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws HttpMethod]))

(def GET
  "Enum Constant.

  type: com.amazonaws.HttpMethod"
  HttpMethod/GET)

(def POST
  "Enum Constant.

  type: com.amazonaws.HttpMethod"
  HttpMethod/POST)

(def PUT
  "Enum Constant.

  type: com.amazonaws.HttpMethod"
  HttpMethod/PUT)

(def DELETE
  "Enum Constant.

  type: com.amazonaws.HttpMethod"
  HttpMethod/DELETE)

(def HEAD
  "Enum Constant.

  type: com.amazonaws.HttpMethod"
  HttpMethod/HEAD)

(def PATCH
  "Enum Constant.

  type: com.amazonaws.HttpMethod"
  HttpMethod/PATCH)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (HttpMethod c : HttpMethod.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.HttpMethod[]`"
  ([]
    (HttpMethod/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.HttpMethod`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.HttpMethod [^java.lang.String name]
    (HttpMethod/valueOf name)))

