(ns com.amazonaws.auth.SignerFactory
  "Signer factory."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth SignerFactory]))

(def *-query-string-signer
  "Static Constant.

  type: java.lang.String"
  SignerFactory/QUERY_STRING_SIGNER)

(def *-version-three-signer
  "Static Constant.

  type: java.lang.String"
  SignerFactory/VERSION_THREE_SIGNER)

(def *-version-four-signer
  "Static Constant.

  type: java.lang.String"
  SignerFactory/VERSION_FOUR_SIGNER)

(def *-version-four-unsigned-payload-signer
  "Static Constant.

  type: java.lang.String"
  SignerFactory/VERSION_FOUR_UNSIGNED_PAYLOAD_SIGNER)

(def *-no-op-signer
  "Static Constant.

  type: java.lang.String"
  SignerFactory/NO_OP_SIGNER)

(defn *register-signer
  "Register an implementation class for the given signer type.

  signer-type - The name of the signer type to register. - `java.lang.String`
  signer-class - The class implementing the given signature protocol. - `java.lang.Class`"
  ([^java.lang.String signer-type ^java.lang.Class signer-class]
    (SignerFactory/registerSigner signer-type signer-class)))

(defn *get-signer
  "Returns a non-null signer for the specified service and region according
   to the internal configuration which provides a basic default algorithm
   used for signer determination.

  service-name - The name of the service to talk to. - `java.lang.String`
  region-name - The name of the region to talk to; not necessarily the region used for signing. - `java.lang.String`

  returns: `com.amazonaws.auth.Signer`"
  (^com.amazonaws.auth.Signer [^java.lang.String service-name ^java.lang.String region-name]
    (SignerFactory/getSigner service-name region-name)))

(defn *get-signer-by-type-and-service
  "Returns an instance of the given signer type and configures it with the
   given service name (if applicable).

  signer-type - The type of signer to create. - `java.lang.String`
  service-name - The name of the service to configure on the signer. - `java.lang.String`

  returns: a non-null signer. - `com.amazonaws.auth.Signer`"
  (^com.amazonaws.auth.Signer [^java.lang.String signer-type ^java.lang.String service-name]
    (SignerFactory/getSignerByTypeAndService signer-type service-name)))

(defn *create-signer
  "Create an instance of the given signer type and initialize it with the
   given parameters.

  signer-type - The signer type. - `java.lang.String`
  params - The parameters to intialize the signer with. - `com.amazonaws.auth.SignerParams`

  returns: The new signer instance. - `com.amazonaws.auth.Signer`"
  (^com.amazonaws.auth.Signer [^java.lang.String signer-type ^com.amazonaws.auth.SignerParams params]
    (SignerFactory/createSigner signer-type params)))

