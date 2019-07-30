(ns com.amazonaws.auth.PEM
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth PEM]))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (PEM c : PEM.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.auth.PEM[]`"
  ([]
    (PEM/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.auth.PEM`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.auth.PEM [^java.lang.String name]
    (PEM/valueOf name)))

(defn *read-private-key
  "Returns the first private key that is found from the input stream of a
   PEM file.

  is - `java.io.InputStream`

  returns: `java.security.PrivateKey`

  throws: java.security.spec.InvalidKeySpecException - if failed to convert the DER bytes into a private key."
  (^java.security.PrivateKey [^java.io.InputStream is]
    (PEM/readPrivateKey is)))

(defn *read-public-key
  "Returns the first public key that is found from the input stream of a PEM
   file.

  is - `java.io.InputStream`

  returns: `java.security.PublicKey`

  throws: java.security.spec.InvalidKeySpecException - if failed to convert the DER bytes into a public key."
  (^java.security.PublicKey [^java.io.InputStream is]
    (PEM/readPublicKey is)))

(defn *read-pem-objects
  "A lower level API used to returns all PEM objects that can be read off
   from the input stream of a PEM file.

   This method can be useful if more than one PEM object of different types
   are embedded in the same PEM file.

  is - `java.io.InputStream`

  returns: `java.util.List<com.amazonaws.auth.PEMObject>`

  throws: java.io.IOException"
  (^java.util.List [^java.io.InputStream is]
    (PEM/readPEMObjects is)))

