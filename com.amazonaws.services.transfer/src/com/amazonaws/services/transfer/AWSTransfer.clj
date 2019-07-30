(ns com.amazonaws.services.transfer.AWSTransfer
  "Interface for accessing AWS Transfer.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSTransfer instead.



  AWS Transfer for SFTP is a fully managed service that enables the transfer of files directly into and out of Amazon
  S3 using the Secure File Transfer Protocol (SFTP)—also known as Secure Shell (SSH) File Transfer Protocol. AWS helps
  you seamlessly migrate your file transfer workflows to AWS Transfer for SFTP—by integrating with existing
  authentication systems, and providing DNS routing with Amazon Route 53—so nothing changes for your customers and
  partners, or their applications. With your data in S3, you can use it with AWS services for processing, analytics,
  machine learning, and archiving. Getting started with AWS Transfer for SFTP (AWS SFTP) is easy; there is no
  infrastructure to buy and setup."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.transfer AWSTransfer]))

(defn delete-server
  "Deletes the Secure File Transfer Protocol (SFTP) server that you specify. If you used
   SERVICE_MANAGED as your IdentityProviderType, you need to delete all users associated
   with this server before deleting the server itself


   No response returns from this call.

  delete-server-request - `com.amazonaws.services.transfer.model.DeleteServerRequest`

  returns: Result of the DeleteServer operation returned by the service. - `com.amazonaws.services.transfer.model.DeleteServerResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.DeleteServerResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.DeleteServerRequest delete-server-request]
    (-> this (.deleteServer delete-server-request))))

(defn list-tags-for-resource
  "Lists all of the tags associated with the Amazon Resource Number (ARN) you specify. The resource can be a user,
   server, or role.

  list-tags-for-resource-request - `com.amazonaws.services.transfer.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.transfer.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.ListTagsForResourceResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn delete-ssh-public-key
  "Deletes a user's Secure Shell (SSH) public key.


   No response is returned from this call.

  delete-ssh-public-key-request - `com.amazonaws.services.transfer.model.DeleteSshPublicKeyRequest`

  returns: Result of the DeleteSshPublicKey operation returned by the service. - `com.amazonaws.services.transfer.model.DeleteSshPublicKeyResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.DeleteSshPublicKeyResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.DeleteSshPublicKeyRequest delete-ssh-public-key-request]
    (-> this (.deleteSshPublicKey delete-ssh-public-key-request))))

(defn update-user
  "Assigns new properties to a user. Parameters you pass modify any or all of the following: the home directory,
   role, and policy for the UserName and ServerId you specify.


   The response returns the ServerId and the UserName for the updated user.

  update-user-request - `com.amazonaws.services.transfer.model.UpdateUserRequest`

  returns: Result of the UpdateUser operation returned by the service. - `com.amazonaws.services.transfer.model.UpdateUserResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.UpdateUserResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.UpdateUserRequest update-user-request]
    (-> this (.updateUser update-user-request))))

(defn create-server
  "Instantiates an autoscaling virtual server based on Secure File Transfer Protocol (SFTP) in AWS. The call returns
   the ServerId property assigned by the service to the newly created server. Reference this
   ServerId property when you make updates to your server, or work with users.


   The response returns the ServerId value for the newly created server.

  create-server-request - `com.amazonaws.services.transfer.model.CreateServerRequest`

  returns: Result of the CreateServer operation returned by the service. - `com.amazonaws.services.transfer.model.CreateServerResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.CreateServerResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.CreateServerRequest create-server-request]
    (-> this (.createServer create-server-request))))

(defn untag-resource
  "Detaches a key-value pair from a resource, as identified by its Amazon Resource Name (ARN). Resources are users,
   servers, roles, and other entities.


   No response is returned from this call.

  untag-resource-request - `com.amazonaws.services.transfer.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.transfer.model.UntagResourceResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.UntagResourceResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn test-identity-provider
  "If the IdentityProviderType of the server is API_Gateway, tests whether your API
   Gateway is set up successfully. We highly recommend that you call this method to test your authentication method
   as soon as you create your server. By doing so, you can troubleshoot issues with the API Gateway integration to
   ensure that your users can successfully use the service.

  test-identity-provider-request - `com.amazonaws.services.transfer.model.TestIdentityProviderRequest`

  returns: Result of the TestIdentityProvider operation returned by the service. - `com.amazonaws.services.transfer.model.TestIdentityProviderResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.TestIdentityProviderResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.TestIdentityProviderRequest test-identity-provider-request]
    (-> this (.testIdentityProvider test-identity-provider-request))))

(defn list-users
  "Lists the users for the server that you specify by passing the ServerId parameter.

  list-users-request - `com.amazonaws.services.transfer.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.transfer.model.ListUsersResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.ListUsersResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.ListUsersRequest list-users-request]
    (-> this (.listUsers list-users-request))))

(defn list-servers
  "Lists the Secure File Transfer Protocol (SFTP) servers that are associated with your AWS account.

  list-servers-request - `com.amazonaws.services.transfer.model.ListServersRequest`

  returns: Result of the ListServers operation returned by the service. - `com.amazonaws.services.transfer.model.ListServersResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.ListServersResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.ListServersRequest list-servers-request]
    (-> this (.listServers list-servers-request))))

(defn create-user
  "Adds a user and associate them with an existing Secure File Transfer Protocol (SFTP) server. Using parameters for
   CreateUser, you can specify the user name, set the home directory, store the user's public key, and
   assign the user's AWS Identity and Access Management (IAM) role. You can also optionally add a scope-down policy,
   and assign metadata with tags that can be used to group and search for users.


   The response returns the UserName and ServerId values of the new user for that server.

  create-user-request - `com.amazonaws.services.transfer.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.transfer.model.CreateUserResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.CreateUserResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.CreateUserRequest create-user-request]
    (-> this (.createUser create-user-request))))

(defn delete-user
  "Deletes the user belonging to the server you specify.


   No response returns from this call.



   When you delete a user from a server, the user's information is lost.

  delete-user-request - `com.amazonaws.services.transfer.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.transfer.model.DeleteUserResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.DeleteUserResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUser delete-user-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSTransfer this]
    (-> this (.shutdown))))

(defn update-server
  "Updates the server properties after that server has been created.


   The UpdateServer call returns the ServerId of the Secure File Transfer Protocol (SFTP)
   server you updated.

  update-server-request - `com.amazonaws.services.transfer.model.UpdateServerRequest`

  returns: Result of the UpdateServer operation returned by the service. - `com.amazonaws.services.transfer.model.UpdateServerResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.UpdateServerResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.UpdateServerRequest update-server-request]
    (-> this (.updateServer update-server-request))))

(defn start-server
  "Changes the state of a Secure File Transfer Protocol (SFTP) server from OFFLINE to
   ONLINE. It has no impact on an SFTP server that is already ONLINE. An
   ONLINE server can accept and process file transfer jobs.


   The state of STARTING indicates that the server is in an intermediate state, either not fully able
   to respond, or not fully online. The values of START_FAILED can indicate an error condition.


   No response is returned from this call.

  start-server-request - `com.amazonaws.services.transfer.model.StartServerRequest`

  returns: Result of the StartServer operation returned by the service. - `com.amazonaws.services.transfer.model.StartServerResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.StartServerResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.StartServerRequest start-server-request]
    (-> this (.startServer start-server-request))))

(defn describe-server
  "Describes the server that you specify by passing the ServerId parameter.


   The response contains a description of the server's properties.

  describe-server-request - `com.amazonaws.services.transfer.model.DescribeServerRequest`

  returns: Result of the DescribeServer operation returned by the service. - `com.amazonaws.services.transfer.model.DescribeServerResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.DescribeServerResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.DescribeServerRequest describe-server-request]
    (-> this (.describeServer describe-server-request))))

(defn stop-server
  "Changes the state of an SFTP server from ONLINE to OFFLINE. An OFFLINE
   server cannot accept and process file transfer jobs. Information tied to your server such as server and user
   properties are not affected by stopping your server. Stopping a server will not reduce or impact your Secure File
   Transfer Protocol (SFTP) endpoint billing.


   The states of STOPPING indicates that the server is in an intermediate state, either not fully able
   to respond, or not fully offline. The values of STOP_FAILED can indicate an error condition.


   No response is returned from this call.

  stop-server-request - `com.amazonaws.services.transfer.model.StopServerRequest`

  returns: Result of the StopServer operation returned by the service. - `com.amazonaws.services.transfer.model.StopServerResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.StopServerResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.StopServerRequest stop-server-request]
    (-> this (.stopServer stop-server-request))))

(defn describe-user
  "Describes the user assigned to a specific server, as identified by its ServerId property.


   The response from this call returns the properties of the user associated with the ServerId value
   that was specified.

  describe-user-request - `com.amazonaws.services.transfer.model.DescribeUserRequest`

  returns: Result of the DescribeUser operation returned by the service. - `com.amazonaws.services.transfer.model.DescribeUserResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.DescribeUserResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.DescribeUserRequest describe-user-request]
    (-> this (.describeUser describe-user-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSTransfer this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn import-ssh-public-key
  "Adds a Secure Shell (SSH) public key to a user account identified by a UserName value assigned to a
   specific server, identified by ServerId.


   The response returns the UserName value, the ServerId value, and the name of the
   SshPublicKeyId.

  import-ssh-public-key-request - `com.amazonaws.services.transfer.model.ImportSshPublicKeyRequest`

  returns: Result of the ImportSshPublicKey operation returned by the service. - `com.amazonaws.services.transfer.model.ImportSshPublicKeyResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.ImportSshPublicKeyResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.ImportSshPublicKeyRequest import-ssh-public-key-request]
    (-> this (.importSshPublicKey import-ssh-public-key-request))))

(defn tag-resource
  "Attaches a key-value pair to a resource, as identified by its Amazon Resource Name (ARN). Resources are users,
   servers, roles, and other entities.


   There is no response returned from this call.

  tag-resource-request - `com.amazonaws.services.transfer.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.transfer.model.TagResourceResult`

  throws: com.amazonaws.services.transfer.model.ServiceUnavailableException - The request has failed because the AWS Transfer for SFTP service is not available."
  (^com.amazonaws.services.transfer.model.TagResourceResult [^AWSTransfer this ^com.amazonaws.services.transfer.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

