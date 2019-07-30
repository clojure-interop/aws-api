(ns com.amazonaws.services.transfer.AbstractAWSTransfer
  "Abstract implementation of AWSTransfer. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.transfer AbstractAWSTransfer]))

(defn delete-server
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.DeleteServerRequest`

  returns: Result of the DeleteServer operation returned by the service. - `com.amazonaws.services.transfer.model.DeleteServerResult`"
  (^com.amazonaws.services.transfer.model.DeleteServerResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.DeleteServerRequest request]
    (-> this (.deleteServer request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.transfer.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.transfer.model.ListTagsForResourceResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn delete-ssh-public-key
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.DeleteSshPublicKeyRequest`

  returns: Result of the DeleteSshPublicKey operation returned by the service. - `com.amazonaws.services.transfer.model.DeleteSshPublicKeyResult`"
  (^com.amazonaws.services.transfer.model.DeleteSshPublicKeyResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.DeleteSshPublicKeyRequest request]
    (-> this (.deleteSshPublicKey request))))

(defn update-user
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.UpdateUserRequest`

  returns: Result of the UpdateUser operation returned by the service. - `com.amazonaws.services.transfer.model.UpdateUserResult`"
  (^com.amazonaws.services.transfer.model.UpdateUserResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.UpdateUserRequest request]
    (-> this (.updateUser request))))

(defn create-server
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.CreateServerRequest`

  returns: Result of the CreateServer operation returned by the service. - `com.amazonaws.services.transfer.model.CreateServerResult`"
  (^com.amazonaws.services.transfer.model.CreateServerResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.CreateServerRequest request]
    (-> this (.createServer request))))

(defn untag-resource
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.transfer.model.UntagResourceResult`"
  (^com.amazonaws.services.transfer.model.UntagResourceResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn test-identity-provider
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.TestIdentityProviderRequest`

  returns: Result of the TestIdentityProvider operation returned by the service. - `com.amazonaws.services.transfer.model.TestIdentityProviderResult`"
  (^com.amazonaws.services.transfer.model.TestIdentityProviderResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.TestIdentityProviderRequest request]
    (-> this (.testIdentityProvider request))))

(defn list-users
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.transfer.model.ListUsersResult`"
  (^com.amazonaws.services.transfer.model.ListUsersResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.ListUsersRequest request]
    (-> this (.listUsers request))))

(defn list-servers
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.ListServersRequest`

  returns: Result of the ListServers operation returned by the service. - `com.amazonaws.services.transfer.model.ListServersResult`"
  (^com.amazonaws.services.transfer.model.ListServersResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.ListServersRequest request]
    (-> this (.listServers request))))

(defn create-user
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.transfer.model.CreateUserResult`"
  (^com.amazonaws.services.transfer.model.CreateUserResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.CreateUserRequest request]
    (-> this (.createUser request))))

(defn delete-user
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.transfer.model.DeleteUserResult`"
  (^com.amazonaws.services.transfer.model.DeleteUserResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn shutdown
  "Description copied from interface: AWSTransfer"
  ([^AbstractAWSTransfer this]
    (-> this (.shutdown))))

(defn update-server
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.UpdateServerRequest`

  returns: Result of the UpdateServer operation returned by the service. - `com.amazonaws.services.transfer.model.UpdateServerResult`"
  (^com.amazonaws.services.transfer.model.UpdateServerResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.UpdateServerRequest request]
    (-> this (.updateServer request))))

(defn start-server
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.StartServerRequest`

  returns: Result of the StartServer operation returned by the service. - `com.amazonaws.services.transfer.model.StartServerResult`"
  (^com.amazonaws.services.transfer.model.StartServerResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.StartServerRequest request]
    (-> this (.startServer request))))

(defn describe-server
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.DescribeServerRequest`

  returns: Result of the DescribeServer operation returned by the service. - `com.amazonaws.services.transfer.model.DescribeServerResult`"
  (^com.amazonaws.services.transfer.model.DescribeServerResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.DescribeServerRequest request]
    (-> this (.describeServer request))))

(defn stop-server
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.StopServerRequest`

  returns: Result of the StopServer operation returned by the service. - `com.amazonaws.services.transfer.model.StopServerResult`"
  (^com.amazonaws.services.transfer.model.StopServerResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.StopServerRequest request]
    (-> this (.stopServer request))))

(defn describe-user
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.DescribeUserRequest`

  returns: Result of the DescribeUser operation returned by the service. - `com.amazonaws.services.transfer.model.DescribeUserResult`"
  (^com.amazonaws.services.transfer.model.DescribeUserResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.DescribeUserRequest request]
    (-> this (.describeUser request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSTransfer

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSTransfer this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn import-ssh-public-key
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.ImportSshPublicKeyRequest`

  returns: Result of the ImportSshPublicKey operation returned by the service. - `com.amazonaws.services.transfer.model.ImportSshPublicKeyResult`"
  (^com.amazonaws.services.transfer.model.ImportSshPublicKeyResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.ImportSshPublicKeyRequest request]
    (-> this (.importSshPublicKey request))))

(defn tag-resource
  "Description copied from interface: AWSTransfer

  request - `com.amazonaws.services.transfer.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.transfer.model.TagResourceResult`"
  (^com.amazonaws.services.transfer.model.TagResourceResult [^AbstractAWSTransfer this ^com.amazonaws.services.transfer.model.TagResourceRequest request]
    (-> this (.tagResource request))))

