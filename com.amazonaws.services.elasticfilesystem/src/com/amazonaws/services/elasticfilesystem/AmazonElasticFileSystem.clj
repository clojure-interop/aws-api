(ns com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem
  "Interface for accessing EFS.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonElasticFileSystem instead.


  Amazon Elastic File System

  Amazon Elastic File System (Amazon EFS) provides simple, scalable file storage for use with Amazon EC2 instances in
  the AWS Cloud. With Amazon EFS, storage capacity is elastic, growing and shrinking automatically as you add and
  remove files, so your applications have the storage they need, when they need it. For more information, see the User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticfilesystem AmazonElasticFileSystem]))

(defn delete-tags
  "Deletes the specified tags from a file system. If the DeleteTags request includes a tag key that
   doesn't exist, Amazon EFS ignores it and doesn't cause an error. For more information about tags and related
   restrictions, see Tag
   Restrictions in the AWS Billing and Cost Management User Guide.


   This operation requires permissions for the elasticfilesystem:DeleteTags action.

  delete-tags-request - `com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DeleteTagsResult`

  throws: com.amazonaws.services.elasticfilesystem.model.BadRequestException - Returned if the request is malformed or contains an error such as an invalid parameter value or a missing required parameter."
  (^com.amazonaws.services.elasticfilesystem.model.DeleteTagsResult [^AmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTags delete-tags-request))))

(defn describe-tags
  "Returns the tags associated with a file system. The order of tags returned in the response of one
   DescribeTags call and the order of tags returned across the responses of a multiple-call iteration
   (when using pagination) is unspecified.


   This operation requires permissions for the elasticfilesystem:DescribeTags action.

  describe-tags-request - `com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DescribeTagsResult`

  throws: com.amazonaws.services.elasticfilesystem.model.BadRequestException - Returned if the request is malformed or contains an error such as an invalid parameter value or a missing required parameter."
  (^com.amazonaws.services.elasticfilesystem.model.DescribeTagsResult [^AmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest describe-tags-request]
    (-> this (.describeTags describe-tags-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonElasticFileSystem this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-mount-targets
  "Returns the descriptions of all the current mount targets, or a specific mount target, for a file system. When
   requesting all of the current mount targets, the order of mount targets returned in the response is unspecified.


   This operation requires permissions for the elasticfilesystem:DescribeMountTargets action, on either
   the file system ID that you specify in FileSystemId, or on the file system of the mount target that
   you specify in MountTargetId.

  describe-mount-targets-request - `com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsRequest`

  returns: Result of the DescribeMountTargets operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsResult`

  throws: com.amazonaws.services.elasticfilesystem.model.BadRequestException - Returned if the request is malformed or contains an error such as an invalid parameter value or a missing required parameter."
  (^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsResult [^AmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsRequest describe-mount-targets-request]
    (-> this (.describeMountTargets describe-mount-targets-request))))

(defn delete-mount-target
  "Deletes the specified mount target.


   This operation forcibly breaks any mounts of the file system by using the mount target that is being deleted,
   which might disrupt instances or applications using those mounts. To avoid applications getting cut off abruptly,
   you might consider unmounting any mounts of the mount target, if feasible. The operation also deletes the
   associated network interface. Uncommitted writes might be lost, but breaking a mount target using this operation
   does not corrupt the file system itself. The file system you created remains. You can mount an EC2 instance in
   your VPC by using another mount target.


   This operation requires permissions for the following action on the file system:




   elasticfilesystem:DeleteMountTarget





   The DeleteMountTarget call returns while the mount target state is still deleting. You
   can check the mount target deletion by calling the DescribeMountTargets operation, which returns a list of
   mount target descriptions for the given file system.



   The operation also requires permissions for the following Amazon EC2 action on the mount target's network
   interface:




   ec2:DeleteNetworkInterface

  delete-mount-target-request - `com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest`

  returns: Result of the DeleteMountTarget operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetResult`

  throws: com.amazonaws.services.elasticfilesystem.model.BadRequestException - Returned if the request is malformed or contains an error such as an invalid parameter value or a missing required parameter."
  (^com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetResult [^AmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest delete-mount-target-request]
    (-> this (.deleteMountTarget delete-mount-target-request))))

(defn describe-lifecycle-configuration
  "Returns the current LifecycleConfiguration object for the specified Amazon EFS file system. EFS
   lifecycle management uses the LifecycleConfiguration object to identify which files to move to the
   EFS Infrequent Access (IA) storage class. For a file system without a LifecycleConfiguration object,
   the call returns an empty array in the response.


   This operation requires permissions for the elasticfilesystem:DescribeLifecycleConfiguration
   operation.

  describe-lifecycle-configuration-request - `com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationRequest`

  returns: Result of the DescribeLifecycleConfiguration operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationResult`

  throws: com.amazonaws.services.elasticfilesystem.model.InternalServerErrorException - Returned if an error occurred on the server side."
  (^com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationResult [^AmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationRequest describe-lifecycle-configuration-request]
    (-> this (.describeLifecycleConfiguration describe-lifecycle-configuration-request))))

(defn create-tags
  "Creates or overwrites tags associated with a file system. Each tag is a key-value pair. If a tag key specified in
   the request already exists on the file system, this operation overwrites its value with the value provided in the
   request. If you add the Name tag to your file system, Amazon EFS returns it in the response to the
   DescribeFileSystems operation.


   This operation requires permission for the elasticfilesystem:CreateTags action.

  create-tags-request - `com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.CreateTagsResult`

  throws: com.amazonaws.services.elasticfilesystem.model.BadRequestException - Returned if the request is malformed or contains an error such as an invalid parameter value or a missing required parameter."
  (^com.amazonaws.services.elasticfilesystem.model.CreateTagsResult [^AmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest create-tags-request]
    (-> this (.createTags create-tags-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonElasticFileSystem this]
    (-> this (.shutdown))))

(defn delete-file-system
  "Deletes a file system, permanently severing access to its contents. Upon return, the file system no longer exists
   and you can't access any contents of the deleted file system.


   You can't delete a file system that is in use. That is, if the file system has any mount targets, you must first
   delete them. For more information, see DescribeMountTargets and DeleteMountTarget.



   The DeleteFileSystem call returns while the file system state is still deleting. You
   can check the file system deletion status by calling the DescribeFileSystems operation, which returns a
   list of file systems in your account. If you pass file system ID or creation token for the deleted file system,
   the DescribeFileSystems returns a 404 FileSystemNotFound error.



   This operation requires permissions for the elasticfilesystem:DeleteFileSystem action.

  delete-file-system-request - `com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest`

  returns: Result of the DeleteFileSystem operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemResult`

  throws: com.amazonaws.services.elasticfilesystem.model.BadRequestException - Returned if the request is malformed or contains an error such as an invalid parameter value or a missing required parameter."
  (^com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemResult [^AmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest delete-file-system-request]
    (-> this (.deleteFileSystem delete-file-system-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"elasticfilesystem.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://elasticfilesystem.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonElasticFileSystem this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn put-lifecycle-configuration
  "Enables lifecycle management by creating a new LifecycleConfiguration object. A
   LifecycleConfiguration object defines when files in an Amazon EFS file system are automatically
   transitioned to the lower-cost EFS Infrequent Access (IA) storage class. A LifecycleConfiguration
   applies to all files in a file system.


   Each Amazon EFS file system supports one lifecycle configuration, which applies to all files in the file system.
   If a LifecycleConfiguration object already exists for the specified file system, a
   PutLifecycleConfiguration call modifies the existing configuration. A
   PutLifecycleConfiguration call with an empty LifecyclePolicies array in the request
   body deletes any existing LifecycleConfiguration and disables lifecycle management.


   In the request, specify the following:




   The ID for the file system for which you are enabling, disabling, or modifying lifecycle management.




   A LifecyclePolicies array of LifecyclePolicy objects that define when files are moved
   to the IA storage class. The array can contain only one LifecyclePolicy item.




   This operation requires permissions for the elasticfilesystem:PutLifecycleConfiguration operation.


   To apply a LifecycleConfiguration object to an encrypted file system, you need the same AWS Key
   Management Service (AWS KMS) permissions as when you created the encrypted file system.

  put-lifecycle-configuration-request - `com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationRequest`

  returns: Result of the PutLifecycleConfiguration operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationResult`

  throws: com.amazonaws.services.elasticfilesystem.model.BadRequestException - Returned if the request is malformed or contains an error such as an invalid parameter value or a missing required parameter."
  (^com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationResult [^AmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationRequest put-lifecycle-configuration-request]
    (-> this (.putLifecycleConfiguration put-lifecycle-configuration-request))))

(defn modify-mount-target-security-groups
  "Modifies the set of security groups in effect for a mount target.


   When you create a mount target, Amazon EFS also creates a new network interface. For more information, see
   CreateMountTarget. This operation replaces the security groups in effect for the network interface
   associated with a mount target, with the SecurityGroups provided in the request. This operation
   requires that the network interface of the mount target has been created and the lifecycle state of the mount
   target is not deleted.


   The operation requires permissions for the following actions:




   elasticfilesystem:ModifyMountTargetSecurityGroups action on the mount target's file system.




   ec2:ModifyNetworkInterfaceAttribute action on the mount target's network interface.

  modify-mount-target-security-groups-request - `com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest`

  returns: Result of the ModifyMountTargetSecurityGroups operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsResult`

  throws: com.amazonaws.services.elasticfilesystem.model.BadRequestException - Returned if the request is malformed or contains an error such as an invalid parameter value or a missing required parameter."
  (^com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsResult [^AmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest modify-mount-target-security-groups-request]
    (-> this (.modifyMountTargetSecurityGroups modify-mount-target-security-groups-request))))

(defn describe-mount-target-security-groups
  "Returns the security groups currently in effect for a mount target. This operation requires that the network
   interface of the mount target has been created and the lifecycle state of the mount target is not
   deleted.


   This operation requires permissions for the following actions:




   elasticfilesystem:DescribeMountTargetSecurityGroups action on the mount target's file system.




   ec2:DescribeNetworkInterfaceAttribute action on the mount target's network interface.

  describe-mount-target-security-groups-request - `com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest`

  returns: Result of the DescribeMountTargetSecurityGroups operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsResult`

  throws: com.amazonaws.services.elasticfilesystem.model.BadRequestException - Returned if the request is malformed or contains an error such as an invalid parameter value or a missing required parameter."
  (^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsResult [^AmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest describe-mount-target-security-groups-request]
    (-> this (.describeMountTargetSecurityGroups describe-mount-target-security-groups-request))))

(defn create-file-system
  "Creates a new, empty file system. The operation requires a creation token in the request that Amazon EFS uses to
   ensure idempotent creation (calling the operation with same creation token has no effect). If a file system does
   not currently exist that is owned by the caller's AWS account with the specified creation token, this operation
   does the following:




   Creates a new, empty file system. The file system will have an Amazon EFS assigned ID, and an initial lifecycle
   state creating.




   Returns with the description of the created file system.




   Otherwise, this operation returns a FileSystemAlreadyExists error with the ID of the existing file
   system.



   For basic use cases, you can use a randomly generated UUID for the creation token.



   The idempotent operation allows you to retry a CreateFileSystem call without risk of creating an
   extra file system. This can happen when an initial call fails in a way that leaves it uncertain whether or not a
   file system was actually created. An example might be that a transport level timeout occurred or your connection
   was reset. As long as you use the same creation token, if the initial call had succeeded in creating a file
   system, the client can learn of its existence from the FileSystemAlreadyExists error.



   The CreateFileSystem call returns while the file system's lifecycle state is still
   creating. You can check the file system creation status by calling the DescribeFileSystems
   operation, which among other things returns the file system state.



   This operation also takes an optional PerformanceMode parameter that you choose for your file
   system. We recommend generalPurpose performance mode for most file systems. File systems using the
   maxIO performance mode can scale to higher levels of aggregate throughput and operations per second
   with a tradeoff of slightly higher latencies for most file operations. The performance mode can't be changed
   after the file system has been created. For more information, see Amazon EFS: Performance
   Modes.


   After the file system is fully created, Amazon EFS sets its lifecycle state to available, at which
   point you can create one or more mount targets for the file system in your VPC. For more information, see
   CreateMountTarget. You mount your Amazon EFS file system on an EC2 instances in your VPC by using the
   mount target. For more information, see Amazon EFS: How it Works.


   This operation requires permissions for the elasticfilesystem:CreateFileSystem action.

  create-file-system-request - `com.amazonaws.services.elasticfilesystem.model.CreateFileSystemRequest`

  returns: Result of the CreateFileSystem operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.CreateFileSystemResult`

  throws: com.amazonaws.services.elasticfilesystem.model.BadRequestException - Returned if the request is malformed or contains an error such as an invalid parameter value or a missing required parameter."
  (^com.amazonaws.services.elasticfilesystem.model.CreateFileSystemResult [^AmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.CreateFileSystemRequest create-file-system-request]
    (-> this (.createFileSystem create-file-system-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonElasticFileSystem this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-file-systems
  "Returns the description of a specific Amazon EFS file system if either the file system CreationToken
   or the FileSystemId is provided. Otherwise, it returns descriptions of all file systems owned by the
   caller's AWS account in the AWS Region of the endpoint that you're calling.


   When retrieving all file system descriptions, you can optionally specify the MaxItems parameter to
   limit the number of descriptions in a response. Currently, this number is automatically set to 10. If more file
   system descriptions remain, Amazon EFS returns a NextMarker, an opaque token, in the response. In
   this case, you should send a subsequent request with the Marker request parameter set to the value
   of NextMarker.


   To retrieve a list of your file system descriptions, this operation is used in an iterative process, where
   DescribeFileSystems is called first without the Marker and then the operation continues
   to call it with the Marker parameter set to the value of the NextMarker from the
   previous response until the response has no NextMarker.


   The order of file systems returned in the response of one DescribeFileSystems call and the order of
   file systems returned across the responses of a multi-call iteration is unspecified.


   This operation requires permissions for the elasticfilesystem:DescribeFileSystems action.

  describe-file-systems-request - `com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsRequest`

  returns: Result of the DescribeFileSystems operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsResult`

  throws: com.amazonaws.services.elasticfilesystem.model.BadRequestException - Returned if the request is malformed or contains an error such as an invalid parameter value or a missing required parameter."
  (^com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsResult [^AmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsRequest describe-file-systems-request]
    (-> this (.describeFileSystems describe-file-systems-request)))
  (^com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsResult [^AmazonElasticFileSystem this]
    (-> this (.describeFileSystems))))

(defn create-mount-target
  "Creates a mount target for a file system. You can then mount the file system on EC2 instances by using the mount
   target.


   You can create one mount target in each Availability Zone in your VPC. All EC2 instances in a VPC within a given
   Availability Zone share a single mount target for a given file system. If you have multiple subnets in an
   Availability Zone, you create a mount target in one of the subnets. EC2 instances do not need to be in the same
   subnet as the mount target in order to access their file system. For more information, see Amazon EFS: How it Works.


   In the request, you also specify a file system ID for which you are creating the mount target and the file
   system's lifecycle state must be available. For more information, see DescribeFileSystems.


   In the request, you also provide a subnet ID, which determines the following:




   VPC in which Amazon EFS creates the mount target




   Availability Zone in which Amazon EFS creates the mount target




   IP address range from which Amazon EFS selects the IP address of the mount target (if you don't specify an IP
   address in the request)




   After creating the mount target, Amazon EFS returns a response that includes, a MountTargetId and an
   IpAddress. You use this IP address when mounting the file system in an EC2 instance. You can also
   use the mount target's DNS name when mounting the file system. The EC2 instance on which you mount the file
   system by using the mount target can resolve the mount target's DNS name to its IP address. For more information,
   see How it
   Works: Implementation Overview.


   Note that you can create mount targets for a file system in only one VPC, and there can be only one mount target
   per Availability Zone. That is, if the file system already has one or more mount targets created for it, the
   subnet specified in the request to add another mount target must meet the following requirements:




   Must belong to the same VPC as the subnets of the existing mount targets




   Must not be in the same Availability Zone as any of the subnets of the existing mount targets




   If the request satisfies the requirements, Amazon EFS does the following:




   Creates a new mount target in the specified subnet.




   Also creates a new network interface in the subnet as follows:




   If the request provides an IpAddress, Amazon EFS assigns that IP address to the network interface.
   Otherwise, Amazon EFS assigns a free address in the subnet (in the same way that the Amazon EC2
   CreateNetworkInterface call does when a request does not specify a primary private IP address).




   If the request provides SecurityGroups, this network interface is associated with those security
   groups. Otherwise, it belongs to the default security group for the subnet's VPC.




   Assigns the description Mount target fsmt-id for file system fs-id  where
    fsmt-id  is the mount target ID, and  fs-id  is the
   FileSystemId.




   Sets the requesterManaged property of the network interface to true, and the
   requesterId value to EFS.




   Each Amazon EFS mount target has one corresponding requester-managed EC2 network interface. After the network
   interface is created, Amazon EFS sets the NetworkInterfaceId field in the mount target's description
   to the network interface ID, and the IpAddress field to its address. If network interface creation
   fails, the entire CreateMountTarget operation fails.





   The CreateMountTarget call returns only after creating the network interface, but while the mount
   target state is still creating, you can check the mount target creation status by calling the
   DescribeMountTargets operation, which among other things returns the mount target state.



   We recommend that you create a mount target in each of the Availability Zones. There are cost considerations for
   using a file system in an Availability Zone through a mount target created in another Availability Zone. For more
   information, see Amazon EFS. In addition, by always using a mount target
   local to the instance's Availability Zone, you eliminate a partial failure scenario. If the Availability Zone in
   which your mount target is created goes down, then you can't access your file system through that mount target.


   This operation requires permissions for the following action on the file system:




   elasticfilesystem:CreateMountTarget




   This operation also requires permissions for the following Amazon EC2 actions:




   ec2:DescribeSubnets




   ec2:DescribeNetworkInterfaces




   ec2:CreateNetworkInterface

  create-mount-target-request - `com.amazonaws.services.elasticfilesystem.model.CreateMountTargetRequest`

  returns: Result of the CreateMountTarget operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.CreateMountTargetResult`

  throws: com.amazonaws.services.elasticfilesystem.model.BadRequestException - Returned if the request is malformed or contains an error such as an invalid parameter value or a missing required parameter."
  (^com.amazonaws.services.elasticfilesystem.model.CreateMountTargetResult [^AmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.CreateMountTargetRequest create-mount-target-request]
    (-> this (.createMountTarget create-mount-target-request))))

(defn update-file-system
  "Updates the throughput mode or the amount of provisioned throughput of an existing file system.

  update-file-system-request - `com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemRequest`

  returns: Result of the UpdateFileSystem operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemResult`

  throws: com.amazonaws.services.elasticfilesystem.model.BadRequestException - Returned if the request is malformed or contains an error such as an invalid parameter value or a missing required parameter."
  (^com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemResult [^AmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemRequest update-file-system-request]
    (-> this (.updateFileSystem update-file-system-request))))

