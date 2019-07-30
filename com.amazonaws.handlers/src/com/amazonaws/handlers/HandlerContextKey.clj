(ns com.amazonaws.handlers.HandlerContextKey
  "A type safe key used for setting and retrieving context in a Request object.



      final HandlerContextKey METRICS_KEY = new HandlerContextKey(\"METRICS_KEY\");

       new RequestHandler2(){"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.handlers HandlerContextKey]))

(defn ->handler-context-key
  "Constructor.

  name - `java.lang.String`"
  (^HandlerContextKey [^java.lang.String name]
    (new HandlerContextKey name)))

(def *-aws-credentials
  "Static Constant.

  The key under which the request credentials are set.

  type: com.amazonaws.handlers.HandlerContextKey<com.amazonaws.auth.AWSCredentials>"
  HandlerContextKey/AWS_CREDENTIALS)

(def *-signing-region
  "Static Constant.

  The region used to sign the request.

  type: com.amazonaws.handlers.HandlerContextKey<java.lang.String>"
  HandlerContextKey/SIGNING_REGION)

(def *-operation-name
  "Static Constant.

  The name of the operation for the request.

  type: com.amazonaws.handlers.HandlerContextKey<java.lang.String>"
  HandlerContextKey/OPERATION_NAME)

(def *-service-id
  "Static Constant.

  The unique identifier for a service to which the request is being sent.

  type: com.amazonaws.handlers.HandlerContextKey<java.lang.String>"
  HandlerContextKey/SERVICE_ID)

(def *-requires-length
  "Static Constant.

  A boolean value indicating if Content-Length header is required by the operation

  type: com.amazonaws.handlers.HandlerContextKey<java.lang.Boolean>"
  HandlerContextKey/REQUIRES_LENGTH)

(def *-has-streaming-input
  "Static Constant.

  A boolean value indicating if the input of the operation has a streaming member.
   If an input shape in operation has streaming trait, then it is a streaming op

  type: com.amazonaws.handlers.HandlerContextKey<java.lang.Boolean>"
  HandlerContextKey/HAS_STREAMING_INPUT)

(def *-advanced-config
  "Static Constant.

  Advanced client configuration. Contents will be service specific.

  type: com.amazonaws.handlers.HandlerContextKey<com.amazonaws.client.builder.AdvancedConfig>"
  HandlerContextKey/ADVANCED_CONFIG)

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^HandlerContextKey this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^HandlerContextKey this]
    (-> this (.getName))))

(defn hash-code
  "returns: `int`"
  (^Integer [^HandlerContextKey this]
    (-> this (.hashCode))))

