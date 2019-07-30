(ns com.amazonaws.protocol.OperationInfo$Builder
  "Builder for a OperationInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.protocol OperationInfo$Builder]))

(defn protocol
  "protocol - `com.amazonaws.protocol.Protocol`

  returns: `com.amazonaws.protocol.OperationInfo$Builder`"
  (^com.amazonaws.protocol.OperationInfo$Builder [^OperationInfo$Builder this ^com.amazonaws.protocol.Protocol protocol]
    (-> this (.protocol protocol))))

(defn operation-identifier
  "operation-identifier - `java.lang.String`

  returns: `com.amazonaws.protocol.OperationInfo$Builder`"
  (^com.amazonaws.protocol.OperationInfo$Builder [^OperationInfo$Builder this ^java.lang.String operation-identifier]
    (-> this (.operationIdentifier operation-identifier))))

(defn has-payload-members
  "has-payload-members - `boolean`

  returns: `com.amazonaws.protocol.OperationInfo$Builder`"
  (^com.amazonaws.protocol.OperationInfo$Builder [^OperationInfo$Builder this ^Boolean has-payload-members]
    (-> this (.hasPayloadMembers has-payload-members))))

(defn build
  "returns: An immutable OperationInfo object. - `com.amazonaws.protocol.OperationInfo`"
  (^com.amazonaws.protocol.OperationInfo [^OperationInfo$Builder this]
    (-> this (.build))))

(defn service-name
  "service-name - `java.lang.String`

  returns: `com.amazonaws.protocol.OperationInfo$Builder`"
  (^com.amazonaws.protocol.OperationInfo$Builder [^OperationInfo$Builder this ^java.lang.String service-name]
    (-> this (.serviceName service-name))))

(defn has-explicit-payload-member
  "has-explicit-payload-member - `boolean`

  returns: `com.amazonaws.protocol.OperationInfo$Builder`"
  (^com.amazonaws.protocol.OperationInfo$Builder [^OperationInfo$Builder this ^Boolean has-explicit-payload-member]
    (-> this (.hasExplicitPayloadMember has-explicit-payload-member))))

(defn http-method-name
  "http-method-name - `com.amazonaws.http.HttpMethodName`

  returns: `com.amazonaws.protocol.OperationInfo$Builder`"
  (^com.amazonaws.protocol.OperationInfo$Builder [^OperationInfo$Builder this ^com.amazonaws.http.HttpMethodName http-method-name]
    (-> this (.httpMethodName http-method-name))))

(defn service-id
  "service-id - `java.lang.String`

  returns: `com.amazonaws.protocol.OperationInfo$Builder`"
  (^com.amazonaws.protocol.OperationInfo$Builder [^OperationInfo$Builder this ^java.lang.String service-id]
    (-> this (.serviceId service-id))))

(defn request-uri
  "request-uri - `java.lang.String`

  returns: `com.amazonaws.protocol.OperationInfo$Builder`"
  (^com.amazonaws.protocol.OperationInfo$Builder [^OperationInfo$Builder this ^java.lang.String request-uri]
    (-> this (.requestUri request-uri))))

