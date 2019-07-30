(ns com.amazonaws.services.ec2instanceconnect.AbstractAWSEC2InstanceConnect
  "Abstract implementation of AWSEC2InstanceConnect. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ec2instanceconnect AbstractAWSEC2InstanceConnect]))

(defn send-ssh-public-key
  "Description copied from interface: AWSEC2InstanceConnect

  request - `com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyRequest`

  returns: Result of the SendSSHPublicKey operation returned by the service. - `com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyResult`"
  (^com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyResult [^AbstractAWSEC2InstanceConnect this ^com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyRequest request]
    (-> this (.sendSSHPublicKey request))))

(defn shutdown
  "Description copied from interface: AWSEC2InstanceConnect"
  ([^AbstractAWSEC2InstanceConnect this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSEC2InstanceConnect

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSEC2InstanceConnect this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

