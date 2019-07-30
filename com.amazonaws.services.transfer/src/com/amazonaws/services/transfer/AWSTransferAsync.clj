(ns com.amazonaws.services.transfer.AWSTransferAsync
  "Interface for accessing AWS Transfer asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSTransferAsync instead.



  AWS Transfer for SFTP is a fully managed service that enables the transfer of files directly into and out of Amazon
  S3 using the Secure File Transfer Protocol (SFTP)—also known as Secure Shell (SSH) File Transfer Protocol. AWS helps
  you seamlessly migrate your file transfer workflows to AWS Transfer for SFTP—by integrating with existing
  authentication systems, and providing DNS routing with Amazon Route 53—so nothing changes for your customers and
  partners, or their applications. With your data in S3, you can use it with AWS services for processing, analytics,
  machine learning, and archiving. Getting started with AWS Transfer for SFTP (AWS SFTP) is easy; there is no
  infrastructure to buy and setup."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.transfer AWSTransferAsync]))

(defn untag-resource-async
  "Detaches a key-value pair from a resource, as identified by its Amazon Resource Name (ARN). Resources are users,
   servers, roles, and other entities.


   No response is returned from this call.

  untag-resource-request - `com.amazonaws.services.transfer.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn update-server-async
  "Updates the server properties after that server has been created.


   The UpdateServer call returns the ServerId of the Secure File Transfer Protocol (SFTP)
   server you updated.

  update-server-request - `com.amazonaws.services.transfer.model.UpdateServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.UpdateServerResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.UpdateServerRequest update-server-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServerAsync update-server-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.UpdateServerRequest update-server-request]
    (-> this (.updateServerAsync update-server-request))))

(defn delete-server-async
  "Deletes the Secure File Transfer Protocol (SFTP) server that you specify. If you used
   SERVICE_MANAGED as your IdentityProviderType, you need to delete all users associated
   with this server before deleting the server itself


   No response returns from this call.

  delete-server-request - `com.amazonaws.services.transfer.model.DeleteServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.DeleteServerResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.DeleteServerRequest delete-server-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServerAsync delete-server-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.DeleteServerRequest delete-server-request]
    (-> this (.deleteServerAsync delete-server-request))))

(defn start-server-async
  "Changes the state of a Secure File Transfer Protocol (SFTP) server from OFFLINE to
   ONLINE. It has no impact on an SFTP server that is already ONLINE. An
   ONLINE server can accept and process file transfer jobs.


   The state of STARTING indicates that the server is in an intermediate state, either not fully able
   to respond, or not fully online. The values of START_FAILED can indicate an error condition.


   No response is returned from this call.

  start-server-request - `com.amazonaws.services.transfer.model.StartServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.StartServerResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.StartServerRequest start-server-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startServerAsync start-server-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.StartServerRequest start-server-request]
    (-> this (.startServerAsync start-server-request))))

(defn describe-server-async
  "Describes the server that you specify by passing the ServerId parameter.


   The response contains a description of the server's properties.

  describe-server-request - `com.amazonaws.services.transfer.model.DescribeServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.DescribeServerResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.DescribeServerRequest describe-server-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServerAsync describe-server-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.DescribeServerRequest describe-server-request]
    (-> this (.describeServerAsync describe-server-request))))

(defn stop-server-async
  "Changes the state of an SFTP server from ONLINE to OFFLINE. An OFFLINE
   server cannot accept and process file transfer jobs. Information tied to your server such as server and user
   properties are not affected by stopping your server. Stopping a server will not reduce or impact your Secure File
   Transfer Protocol (SFTP) endpoint billing.


   The states of STOPPING indicates that the server is in an intermediate state, either not fully able
   to respond, or not fully offline. The values of STOP_FAILED can indicate an error condition.


   No response is returned from this call.

  stop-server-request - `com.amazonaws.services.transfer.model.StopServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.StopServerResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.StopServerRequest stop-server-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopServerAsync stop-server-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.StopServerRequest stop-server-request]
    (-> this (.stopServerAsync stop-server-request))))

(defn delete-user-async
  "Deletes the user belonging to the server you specify.


   No response returns from this call.



   When you delete a user from a server, the user's information is lost.

  delete-user-request - `com.amazonaws.services.transfer.model.DeleteUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.DeleteUserRequest delete-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync delete-user-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUserAsync delete-user-request))))

(defn delete-ssh-public-key-async
  "Deletes a user's Secure Shell (SSH) public key.


   No response is returned from this call.

  delete-ssh-public-key-request - `com.amazonaws.services.transfer.model.DeleteSshPublicKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSshPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.DeleteSshPublicKeyResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.DeleteSshPublicKeyRequest delete-ssh-public-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSshPublicKeyAsync delete-ssh-public-key-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.DeleteSshPublicKeyRequest delete-ssh-public-key-request]
    (-> this (.deleteSshPublicKeyAsync delete-ssh-public-key-request))))

(defn create-user-async
  "Adds a user and associate them with an existing Secure File Transfer Protocol (SFTP) server. Using parameters for
   CreateUser, you can specify the user name, set the home directory, store the user's public key, and
   assign the user's AWS Identity and Access Management (IAM) role. You can also optionally add a scope-down policy,
   and assign metadata with tags that can be used to group and search for users.


   The response returns the UserName and ServerId values of the new user for that server.

  create-user-request - `com.amazonaws.services.transfer.model.CreateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.CreateUserRequest create-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync create-user-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.CreateUserRequest create-user-request]
    (-> this (.createUserAsync create-user-request))))

(defn list-servers-async
  "Lists the Secure File Transfer Protocol (SFTP) servers that are associated with your AWS account.

  list-servers-request - `com.amazonaws.services.transfer.model.ListServersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.ListServersResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.ListServersRequest list-servers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServersAsync list-servers-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.ListServersRequest list-servers-request]
    (-> this (.listServersAsync list-servers-request))))

(defn create-server-async
  "Instantiates an autoscaling virtual server based on Secure File Transfer Protocol (SFTP) in AWS. The call returns
   the ServerId property assigned by the service to the newly created server. Reference this
   ServerId property when you make updates to your server, or work with users.


   The response returns the ServerId value for the newly created server.

  create-server-request - `com.amazonaws.services.transfer.model.CreateServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.CreateServerResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.CreateServerRequest create-server-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createServerAsync create-server-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.CreateServerRequest create-server-request]
    (-> this (.createServerAsync create-server-request))))

(defn list-tags-for-resource-async
  "Lists all of the tags associated with the Amazon Resource Number (ARN) you specify. The resource can be a user,
   server, or role.

  list-tags-for-resource-request - `com.amazonaws.services.transfer.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn describe-user-async
  "Describes the user assigned to a specific server, as identified by its ServerId property.


   The response from this call returns the properties of the user associated with the ServerId value
   that was specified.

  describe-user-request - `com.amazonaws.services.transfer.model.DescribeUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.DescribeUserResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.DescribeUserRequest describe-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserAsync describe-user-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.DescribeUserRequest describe-user-request]
    (-> this (.describeUserAsync describe-user-request))))

(defn import-ssh-public-key-async
  "Adds a Secure Shell (SSH) public key to a user account identified by a UserName value assigned to a
   specific server, identified by ServerId.


   The response returns the UserName value, the ServerId value, and the name of the
   SshPublicKeyId.

  import-ssh-public-key-request - `com.amazonaws.services.transfer.model.ImportSshPublicKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportSshPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.ImportSshPublicKeyResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.ImportSshPublicKeyRequest import-ssh-public-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importSshPublicKeyAsync import-ssh-public-key-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.ImportSshPublicKeyRequest import-ssh-public-key-request]
    (-> this (.importSshPublicKeyAsync import-ssh-public-key-request))))

(defn test-identity-provider-async
  "If the IdentityProviderType of the server is API_Gateway, tests whether your API
   Gateway is set up successfully. We highly recommend that you call this method to test your authentication method
   as soon as you create your server. By doing so, you can troubleshoot issues with the API Gateway integration to
   ensure that your users can successfully use the service.

  test-identity-provider-request - `com.amazonaws.services.transfer.model.TestIdentityProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestIdentityProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.TestIdentityProviderResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.TestIdentityProviderRequest test-identity-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testIdentityProviderAsync test-identity-provider-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.TestIdentityProviderRequest test-identity-provider-request]
    (-> this (.testIdentityProviderAsync test-identity-provider-request))))

(defn list-users-async
  "Lists the users for the server that you specify by passing the ServerId parameter.

  list-users-request - `com.amazonaws.services.transfer.model.ListUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.ListUsersRequest list-users-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync list-users-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.ListUsersRequest list-users-request]
    (-> this (.listUsersAsync list-users-request))))

(defn tag-resource-async
  "Attaches a key-value pair to a resource, as identified by its Amazon Resource Name (ARN). Resources are users,
   servers, roles, and other entities.


   There is no response returned from this call.

  tag-resource-request - `com.amazonaws.services.transfer.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn update-user-async
  "Assigns new properties to a user. Parameters you pass modify any or all of the following: the home directory,
   role, and policy for the UserName and ServerId you specify.


   The response returns the ServerId and the UserName for the updated user.

  update-user-request - `com.amazonaws.services.transfer.model.UpdateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transfer.model.UpdateUserResult>`"
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.UpdateUserRequest update-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserAsync update-user-request async-handler)))
  (^java.util.concurrent.Future [^AWSTransferAsync this ^com.amazonaws.services.transfer.model.UpdateUserRequest update-user-request]
    (-> this (.updateUserAsync update-user-request))))

