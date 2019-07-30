(ns com.amazonaws.services.cloud9.AWSCloud9Client
  "Client for accessing AWS Cloud9. All service calls made using this client are blocking, and will not return until the
  service call completes.

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
  (:import [com.amazonaws.services.cloud9 AWSCloud9Client]))

(defn *builder
  "returns: `com.amazonaws.services.cloud9.AWSCloud9ClientBuilder`"
  (^com.amazonaws.services.cloud9.AWSCloud9ClientBuilder []
    (AWSCloud9Client/builder )))

(defn delete-environment-membership
  "Deletes an environment member from an AWS Cloud9 development environment.

  request - `com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest`

  returns: Result of the DeleteEnvironmentMembership operation returned by the service. - `com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipResult [^AWSCloud9Client this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest request]
    (-> this (.deleteEnvironmentMembership request))))

(defn create-environment-ec-2
  "Creates an AWS Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance,
   and then connects from the instance to the environment.

  request - `com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request`

  returns: Result of the CreateEnvironmentEC2 operation returned by the service. - `com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Result`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Result [^AWSCloud9Client this ^com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request request]
    (-> this (.createEnvironmentEC2 request))))

(defn describe-environment-status
  "Gets status information for an AWS Cloud9 development environment.

  request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest`

  returns: Result of the DescribeEnvironmentStatus operation returned by the service. - `com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusResult [^AWSCloud9Client this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest request]
    (-> this (.describeEnvironmentStatus request))))

(defn create-environment-membership
  "Adds an environment member to an AWS Cloud9 development environment.

  request - `com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest`

  returns: Result of the CreateEnvironmentMembership operation returned by the service. - `com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipResult [^AWSCloud9Client this ^com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest request]
    (-> this (.createEnvironmentMembership request))))

(defn update-environment-membership
  "Changes the settings of an existing environment member for an AWS Cloud9 development environment.

  request - `com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest`

  returns: Result of the UpdateEnvironmentMembership operation returned by the service. - `com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipResult [^AWSCloud9Client this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest request]
    (-> this (.updateEnvironmentMembership request))))

(defn describe-environments
  "Gets information about AWS Cloud9 development environments.

  request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest`

  returns: Result of the DescribeEnvironments operation returned by the service. - `com.amazonaws.services.cloud9.model.DescribeEnvironmentsResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.DescribeEnvironmentsResult [^AWSCloud9Client this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest request]
    (-> this (.describeEnvironments request))))

(defn list-environments
  "Gets a list of AWS Cloud9 development environment identifiers.

  request - `com.amazonaws.services.cloud9.model.ListEnvironmentsRequest`

  returns: Result of the ListEnvironments operation returned by the service. - `com.amazonaws.services.cloud9.model.ListEnvironmentsResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.ListEnvironmentsResult [^AWSCloud9Client this ^com.amazonaws.services.cloud9.model.ListEnvironmentsRequest request]
    (-> this (.listEnvironments request))))

(defn describe-environment-memberships
  "Gets information about environment members for an AWS Cloud9 development environment.

  request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest`

  returns: Result of the DescribeEnvironmentMemberships operation returned by the service. - `com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsResult [^AWSCloud9Client this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest request]
    (-> this (.describeEnvironmentMemberships request))))

(defn delete-environment
  "Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also
   terminates the instance.

  request - `com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest`

  returns: Result of the DeleteEnvironment operation returned by the service. - `com.amazonaws.services.cloud9.model.DeleteEnvironmentResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.DeleteEnvironmentResult [^AWSCloud9Client this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest request]
    (-> this (.deleteEnvironment request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCloud9Client this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-environment
  "Changes the settings of an existing AWS Cloud9 development environment.

  request - `com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest`

  returns: Result of the UpdateEnvironment operation returned by the service. - `com.amazonaws.services.cloud9.model.UpdateEnvironmentResult`

  throws: com.amazonaws.services.cloud9.model.BadRequestException - The target request is invalid."
  (^com.amazonaws.services.cloud9.model.UpdateEnvironmentResult [^AWSCloud9Client this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest request]
    (-> this (.updateEnvironment request))))

