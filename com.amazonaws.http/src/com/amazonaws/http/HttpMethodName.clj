(ns com.amazonaws.http.HttpMethodName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http HttpMethodName]))

(def GET
  "Enum Constant.

  type: com.amazonaws.http.HttpMethodName"
  HttpMethodName/GET)

(def POST
  "Enum Constant.

  type: com.amazonaws.http.HttpMethodName"
  HttpMethodName/POST)

(def PUT
  "Enum Constant.

  type: com.amazonaws.http.HttpMethodName"
  HttpMethodName/PUT)

(def DELETE
  "Enum Constant.

  type: com.amazonaws.http.HttpMethodName"
  HttpMethodName/DELETE)

(def HEAD
  "Enum Constant.

  type: com.amazonaws.http.HttpMethodName"
  HttpMethodName/HEAD)

(def PATCH
  "Enum Constant.

  type: com.amazonaws.http.HttpMethodName"
  HttpMethodName/PATCH)

(def OPTIONS
  "Enum Constant.

  type: com.amazonaws.http.HttpMethodName"
  HttpMethodName/OPTIONS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (HttpMethodName c : HttpMethodName.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.http.HttpMethodName[]`"
  ([]
    (HttpMethodName/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.http.HttpMethodName`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.http.HttpMethodName [^java.lang.String name]
    (HttpMethodName/valueOf name)))

(defn *from-value
  "value - Raw string representing value of enum - `java.lang.String`

  returns: HttpMethodName enum or null if value is not present. - `com.amazonaws.http.HttpMethodName`

  throws: java.lang.IllegalArgumentException - If value does not represent a known enum value."
  (^com.amazonaws.http.HttpMethodName [^java.lang.String value]
    (HttpMethodName/fromValue value)))

