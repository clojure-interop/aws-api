(ns com.amazonaws.services.ec2instanceconnect.AWSEC2InstanceConnect
  "Interface for accessing EC2 Instance Connect.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSEC2InstanceConnect instead.



  AWS EC2 Connect Service is a service that enables system administrators to publish temporary SSH keys to their EC2
  instances in order to establish connections to their instances without leaving a permanent authentication option."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ec2instanceconnect AWSEC2InstanceConnect]))

(defn send-ssh-public-key
  "Pushes an SSH public key to a particular OS user on a given EC2 instance for 60 seconds.

  send-ssh-public-key-request - `com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyRequest`

  returns: Result of the SendSSHPublicKey operation returned by the service. - `com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyResult`

  throws: com.amazonaws.services.ec2instanceconnect.model.AuthException - Indicates that either your AWS credentials are invalid or you do not have access to the EC2 instance."
  (^com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyResult [^AWSEC2InstanceConnect this ^com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyRequest send-ssh-public-key-request]
    (-> this (.sendSSHPublicKey send-ssh-public-key-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSEC2InstanceConnect this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSEC2InstanceConnect this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

