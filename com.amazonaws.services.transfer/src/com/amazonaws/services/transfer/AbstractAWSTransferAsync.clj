(ns com.amazonaws.services.transfer.AbstractAWSTransferAsync
  "Abstract implementation of AWSTransferAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.transfer AbstractAWSTransferAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn update-server-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.UpdateServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.UpdateServerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.UpdateServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.UpdateServerRequest request]
    (-> this (.updateServerAsync request))))

(defn delete-server-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.DeleteServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.DeleteServerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.DeleteServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.DeleteServerRequest request]
    (-> this (.deleteServerAsync request))))

(defn start-server-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.StartServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.StartServerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.StartServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.StartServerRequest request]
    (-> this (.startServerAsync request))))

(defn describe-server-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.DescribeServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.DescribeServerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.DescribeServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.DescribeServerRequest request]
    (-> this (.describeServerAsync request))))

(defn stop-server-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.StopServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.StopServerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.StopServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.StopServerRequest request]
    (-> this (.stopServerAsync request))))

(defn delete-user-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.DeleteUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.DeleteUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.DeleteUserRequest request]
    (-> this (.deleteUserAsync request))))

(defn delete-ssh-public-key-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.DeleteSshPublicKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSshPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.DeleteSshPublicKeyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.DeleteSshPublicKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSshPublicKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.DeleteSshPublicKeyRequest request]
    (-> this (.deleteSshPublicKeyAsync request))))

(defn create-user-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.CreateUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.CreateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.CreateUserRequest request]
    (-> this (.createUserAsync request))))

(defn list-servers-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.ListServersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.ListServersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.ListServersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.ListServersRequest request]
    (-> this (.listServersAsync request))))

(defn create-server-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.CreateServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.CreateServerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.CreateServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.CreateServerRequest request]
    (-> this (.createServerAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn describe-user-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.DescribeUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.DescribeUserResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.DescribeUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.DescribeUserRequest request]
    (-> this (.describeUserAsync request))))

(defn import-ssh-public-key-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.ImportSshPublicKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportSshPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.ImportSshPublicKeyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.ImportSshPublicKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importSshPublicKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.ImportSshPublicKeyRequest request]
    (-> this (.importSshPublicKeyAsync request))))

(defn test-identity-provider-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.TestIdentityProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestIdentityProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.TestIdentityProviderResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.TestIdentityProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testIdentityProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.TestIdentityProviderRequest request]
    (-> this (.testIdentityProviderAsync request))))

(defn list-users-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.ListUsersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.ListUsersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.ListUsersRequest request]
    (-> this (.listUsersAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn update-user-async
  "Description copied from interface: AWSTransferAsync

  request - `com.amazonaws.services.transfer.model.UpdateUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.UpdateUserResult>`"
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.UpdateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSTransferAsync this ^com.amazonaws.services.transfer.model.UpdateUserRequest request]
    (-> this (.updateUserAsync request))))

