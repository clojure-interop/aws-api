(ns com.amazonaws.services.cloud9.AWSCloud9
  "Interface for accessing AWS Cloud9.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCloud9 instead.


  AWS Cloud9

  AWS Cloud9 is a collection of tools that you can use to code, build, run, test, debug, and release software in the
  cloud.


  For more information about AWS Cloud9, see the AWS
  Cloud9 User Guide.


  AWS Cloud9 supports these operations:




  CreateEnvironmentEC2: Creates an AWS Cloud9 development environment, launches an Amazon EC2 instance,
  and then connects from the instance to the environment.




  CreateEnvironmentMembership: Adds an environment member to an environment.




  DeleteEnvironment: Deletes an environment. If an Amazon EC2 instance is connected to the environment,
  also terminates the instance.




  DeleteEnvironmentMembership: Deletes an environment member from an environment.




  DescribeEnvironmentMemberships: Gets information about environment members for an environment.




  DescribeEnvironments: Gets information about environments.




  DescribeEnvironmentStatus: Gets status information for an environment.




  ListEnvironments: Gets a list of environment identifiers.




  UpdateEnvironment: Changes the settings of an existing environment.




  UpdateEnvironmentMembership: Changes the settings of an existing environment member for an environment."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloud9 AWSCloud9]))

(defn delete-environment-membership
  "Deletes an environment member from an AWS Cloud9 development environment.

  delete-environment-membership-request - `com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest`

  returns: Result of the DeleteEnvironmentMembership operation returned by the service. - `com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipResult [^AWSCloud9 this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest delete-environment-membership-request]
    (-> this (.deleteEnvironmentMembership delete-environment-membership-request))))

(defn create-environment-ec-2
  "Creates an AWS Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance,
   and then connects from the instance to the environment.

  create-environment-ec-2-request - `com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request`

  returns: Result of the CreateEnvironmentEC2 operation returned by the service. - `com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Result`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Result [^AWSCloud9 this ^com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request create-environment-ec-2-request]
    (-> this (.createEnvironmentEC2 create-environment-ec-2-request))))

(defn describe-environment-status
  "Gets status information for an AWS Cloud9 development environment.

  describe-environment-status-request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest`

  returns: Result of the DescribeEnvironmentStatus operation returned by the service. - `com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusResult [^AWSCloud9 this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest describe-environment-status-request]
    (-> this (.describeEnvironmentStatus describe-environment-status-request))))

(defn create-environment-membership
  "Adds an environment member to an AWS Cloud9 development environment.

  create-environment-membership-request - `com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest`

  returns: Result of the CreateEnvironmentMembership operation returned by the service. - `com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipResult [^AWSCloud9 this ^com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest create-environment-membership-request]
    (-> this (.createEnvironmentMembership create-environment-membership-request))))

(defn update-environment-membership
  "Changes the settings of an existing environment member for an AWS Cloud9 development environment.

  update-environment-membership-request - `com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest`

  returns: Result of the UpdateEnvironmentMembership operation returned by the service. - `com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipResult [^AWSCloud9 this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest update-environment-membership-request]
    (-> this (.updateEnvironmentMembership update-environment-membership-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSCloud9 this]
    (-> this (.shutdown))))

(defn describe-environments
  "Gets information about AWS Cloud9 development environments.

  describe-environments-request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest`

  returns: Result of the DescribeEnvironments operation returned by the service. - `com.amazonaws.services.cloud9.model.DescribeEnvironmentsResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.DescribeEnvironmentsResult [^AWSCloud9 this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest describe-environments-request]
    (-> this (.describeEnvironments describe-environments-request))))

(defn list-environments
  "Gets a list of AWS Cloud9 development environment identifiers.

  list-environments-request - `com.amazonaws.services.cloud9.model.ListEnvironmentsRequest`

  returns: Result of the ListEnvironments operation returned by the service. - `com.amazonaws.services.cloud9.model.ListEnvironmentsResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.ListEnvironmentsResult [^AWSCloud9 this ^com.amazonaws.services.cloud9.model.ListEnvironmentsRequest list-environments-request]
    (-> this (.listEnvironments list-environments-request))))

(defn describe-environment-memberships
  "Gets information about environment members for an AWS Cloud9 development environment.

  describe-environment-memberships-request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest`

  returns: Result of the DescribeEnvironmentMemberships operation returned by the service. - `com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsResult [^AWSCloud9 this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest describe-environment-memberships-request]
    (-> this (.describeEnvironmentMemberships describe-environment-memberships-request))))

(defn delete-environment
  "Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also
   terminates the instance.

  delete-environment-request - `com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest`

  returns: Result of the DeleteEnvironment operation returned by the service. - `com.amazonaws.services.cloud9.model.DeleteEnvironmentResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.DeleteEnvironmentResult [^AWSCloud9 this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest delete-environment-request]
    (-> this (.deleteEnvironment delete-environment-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCloud9 this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-environment
  "Changes the settings of an existing AWS Cloud9 development environment.

  update-environment-request - `com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest`

  returns: Result of the UpdateEnvironment operation returned by the service. - `com.amazonaws.services.cloud9.model.UpdateEnvironmentResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.UpdateEnvironmentResult [^AWSCloud9 this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest update-environment-request]
    (-> this (.updateEnvironment update-environment-request))))

