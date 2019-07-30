(ns com.amazonaws.protocol.OperationInfo
  "Static information about an API operation used to marshall it correctly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.protocol OperationInfo]))

(defn *builder
  "returns: Builder instance to construct a OperationInfo. - `com.amazonaws.protocol.OperationInfo$Builder`"
  (^com.amazonaws.protocol.OperationInfo$Builder []
    (OperationInfo/builder )))

(defn protocol
  "returns: The protocol of the client. Gives hints to the marshaller on how things should be transformed. - `com.amazonaws.protocol.Protocol`"
  (^com.amazonaws.protocol.Protocol [^OperationInfo this]
    (-> this (.protocol))))

(defn request-uri
  "returns: Request URI for operation (may contain placeholders for members bound to the uri). - `java.lang.String`"
  (^java.lang.String [^OperationInfo this]
    (-> this (.requestUri))))

(defn http-method-name
  "returns: HTTP Method that should be used when sending the request. - `com.amazonaws.http.HttpMethodName`"
  (^com.amazonaws.http.HttpMethodName [^OperationInfo this]
    (-> this (.httpMethodName))))

(defn operation-identifier
  "returns: Identifer for the operation/API being invoked. This is used for RPC based protocols that
   need to identify which action is being taken. For Query/EC2 protocol this is sent as the 'Action' query
   parameter, for JSON RPC this is sent as the 'X-Amz-Target' header. - `java.lang.String`"
  (^java.lang.String [^OperationInfo this]
    (-> this (.operationIdentifier))))

(defn service-name
  "returns: Display name for the service. Mainly used for the metrics system but is also available on the Request
   object (to do something in a RequestHandler2 for example). This is usually the service
   interface name but may be customized at generation time ('AmazonDynamoDBv2' for example). - `java.lang.String`"
  (^java.lang.String [^OperationInfo this]
    (-> this (.serviceName))))

(defn has-explicit-payload-member?
  "returns: True if the operation has a member that's explicitly marked as the payload. False otherwise. (Applicable only to
   RESTUL protocols). - `boolean`"
  (^Boolean [^OperationInfo this]
    (-> this (.hasExplicitPayloadMember))))

(defn has-payload-members?
  "returns: True if the operation has members bound to the payload. Some requests (especially GET and DELETE) may not
   have any members bound to the payload. (Applicable only to RESTFUL protocols). - `boolean`"
  (^Boolean [^OperationInfo this]
    (-> this (.hasPayloadMembers))))

(defn service-id
  "returns: `java.lang.String`"
  (^java.lang.String [^OperationInfo this]
    (-> this (.serviceId))))

