(ns com.amazonaws.services.cloudformation.AmazonCloudFormationClient
  "Client for accessing AWS CloudFormation. All service calls made using this client are blocking, and will not return
  until the service call completes.

  AWS CloudFormation

  AWS CloudFormation allows you to create and manage AWS infrastructure deployments predictably and repeatedly. You can
  use AWS CloudFormation to leverage AWS products, such as Amazon Elastic Compute Cloud, Amazon Elastic Block Store,
  Amazon Simple Notification Service, Elastic Load Balancing, and Auto Scaling to build highly-reliable, highly
  scalable, cost-effective applications without creating or configuring the underlying AWS infrastructure.


  With AWS CloudFormation, you declare all of your resources and dependencies in a template file. The template defines
  a collection of resources as a single unit called a stack. AWS CloudFormation creates and deletes all member
  resources of the stack together and manages all dependencies between the resources for you.


  For more information about AWS CloudFormation, see the AWS
  CloudFormation Product Page.


  Amazon CloudFormation makes use of other AWS products. If you need additional technical information about a specific
  AWS product, you can find the product's technical documentation at docs.aws.amazon.com."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudformation AmazonCloudFormationClient]))

(defn ->amazon-cloud-formation-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS CloudFormation (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonCloudFormationClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonCloudFormationClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonCloudFormationClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCloudFormationClient aws-credentials client-configuration))
  (^AmazonCloudFormationClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCloudFormationClient client-configuration))
  (^AmazonCloudFormationClient []
    (new AmazonCloudFormationClient )))

(defn *builder
  "returns: `com.amazonaws.services.cloudformation.AmazonCloudFormationClientBuilder`"
  (^com.amazonaws.services.cloudformation.AmazonCloudFormationClientBuilder []
    (AmazonCloudFormationClient/builder )))

(defn detect-stack-drift
  "Detects whether a stack's actual configuration differs, or has drifted, from it's expected configuration,
   as defined in the stack template and any values specified as template parameters. For each resource in the stack
   that supports drift detection, AWS CloudFormation compares the actual configuration of the resource with its
   expected template configuration. Only resource properties explicitly defined in the stack template are checked
   for drift. A stack is considered to have drifted if one or more of its resources differ from their expected
   template configurations. For more information, see Detecting
   Unregulated Configuration Changes to Stacks and Resources.


   Use DetectStackDrift to detect drift on all supported resources for a given stack, or
   DetectStackResourceDrift to detect drift on individual resources.


   For a list of stack resources that currently support drift detection, see Resources that Support Drift Detection.


   DetectStackDrift can take up to several minutes, depending on the number of resources contained
   within the stack. Use DescribeStackDriftDetectionStatus to monitor the progress of a detect stack drift
   operation. Once the drift detection operation has completed, use DescribeStackResourceDrifts to return
   drift information about the stack and its resources.


   When detecting drift on a stack, AWS CloudFormation does not detect drift on any nested stacks belonging to that
   stack. Perform DetectStackDrift directly on the nested stack itself.

  request - `com.amazonaws.services.cloudformation.model.DetectStackDriftRequest`

  returns: Result of the DetectStackDrift operation returned by the service. - `com.amazonaws.services.cloudformation.model.DetectStackDriftResult`"
  (^com.amazonaws.services.cloudformation.model.DetectStackDriftResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DetectStackDriftRequest request]
    (-> this (.detectStackDrift request))))

(defn describe-stack-drift-detection-status
  "Returns information about a stack drift detection operation. A stack drift detection operation detects whether a
   stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the
   stack template and any values specified as template parameters. A stack is considered to have drifted if one or
   more of its resources have drifted. For more information on stack and resource drift, see Detecting
   Unregulated Configuration Changes to Stacks and Resources.


   Use DetectStackDrift to initiate a stack drift detection operation. DetectStackDrift returns
   a StackDriftDetectionId you can use to monitor the progress of the operation using
   DescribeStackDriftDetectionStatus. Once the drift detection operation has completed, use
   DescribeStackResourceDrifts to return drift information about the stack and its resources.

  request - `com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusRequest`

  returns: Result of the DescribeStackDriftDetectionStatus operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusRequest request]
    (-> this (.describeStackDriftDetectionStatus request))))

(defn detect-stack-resource-drift
  "Returns information about whether a resource's actual configuration differs, or has drifted, from it's
   expected configuration, as defined in the stack template and any values specified as template parameters. This
   information includes actual and expected property values for resources in which AWS CloudFormation detects drift.
   Only resource properties explicitly defined in the stack template are checked for drift. For more information
   about stack and resource drift, see Detecting
   Unregulated Configuration Changes to Stacks and Resources.


   Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to
   detect drift on all resources in a given stack that support drift detection.


   Resources that do not currently support drift detection cannot be checked. For a list of resources that support
   drift detection, see Resources that Support Drift Detection.

  request - `com.amazonaws.services.cloudformation.model.DetectStackResourceDriftRequest`

  returns: Result of the DetectStackResourceDrift operation returned by the service. - `com.amazonaws.services.cloudformation.model.DetectStackResourceDriftResult`"
  (^com.amazonaws.services.cloudformation.model.DetectStackResourceDriftResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DetectStackResourceDriftRequest request]
    (-> this (.detectStackResourceDrift request))))

(defn update-stack-instances
  "Updates the parameter values for stack instances for the specified accounts, within the specified regions. A
   stack instance refers to a stack in a specific account and region.


   You can only update stack instances in regions and accounts where they already exist; to create additional stack
   instances, use CreateStackInstances.


   During stack set updates, any parameters overridden for a stack instance are not updated, but retain their
   overridden value.


   You can only update the parameter values that are specified in the stack set; to add or delete a parameter
   itself, use UpdateStackSet
    to update the stack set template. If you add a parameter to a template, before you can override the
   parameter value specified in the stack set you must first use UpdateStackSet to update all stack instances with the updated template and parameter value specified in the
   stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter
   value using UpdateStackInstances.

  request - `com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest`

  returns: Result of the UpdateStackInstances operation returned by the service. - `com.amazonaws.services.cloudformation.model.UpdateStackInstancesResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.UpdateStackInstancesResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest request]
    (-> this (.updateStackInstances request))))

(defn validate-template
  "Validates a specified template. AWS CloudFormation first checks if the template is valid JSON. If it isn't, AWS
   CloudFormation checks if the template is valid YAML. If both these checks fail, AWS CloudFormation returns a
   template validation error.

  request - `com.amazonaws.services.cloudformation.model.ValidateTemplateRequest`

  returns: Result of the ValidateTemplate operation returned by the service. - `com.amazonaws.services.cloudformation.model.ValidateTemplateResult`"
  (^com.amazonaws.services.cloudformation.model.ValidateTemplateResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.ValidateTemplateRequest request]
    (-> this (.validateTemplate request))))

(defn describe-stacks
  "Returns the description for the specified stack; if no stack name was specified, then it returns the description
   for all the stacks created.



   If the stack does not exist, an AmazonCloudFormationException is returned.

  request - `com.amazonaws.services.cloudformation.model.DescribeStacksRequest`

  returns: Result of the DescribeStacks operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStacksResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStacksResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DescribeStacksRequest request]
    (-> this (.describeStacks request)))
  (^com.amazonaws.services.cloudformation.model.DescribeStacksResult [^AmazonCloudFormationClient this]
    (-> this (.describeStacks))))

(defn describe-stack-resource
  "Returns a description of the specified resource in the specified stack.


   For deleted stacks, DescribeStackResource returns resource information for up to 90 days after the stack has been
   deleted.

  request - `com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest`

  returns: Result of the DescribeStackResource operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackResourceResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackResourceResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest request]
    (-> this (.describeStackResource request))))

(defn waiters
  "returns: `com.amazonaws.services.cloudformation.waiters.AmazonCloudFormationWaiters`"
  (^com.amazonaws.services.cloudformation.waiters.AmazonCloudFormationWaiters [^AmazonCloudFormationClient this]
    (-> this (.waiters))))

(defn get-stack-policy
  "Returns the stack policy for a specified stack. If a stack doesn't have a policy, a null value is returned.

  request - `com.amazonaws.services.cloudformation.model.GetStackPolicyRequest`

  returns: Result of the GetStackPolicy operation returned by the service. - `com.amazonaws.services.cloudformation.model.GetStackPolicyResult`"
  (^com.amazonaws.services.cloudformation.model.GetStackPolicyResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.GetStackPolicyRequest request]
    (-> this (.getStackPolicy request))))

(defn update-stack
  "Updates a stack as specified in the template. After the call completes successfully, the stack update starts. You
   can check the status of the stack via the DescribeStacks action.


   To get a copy of the template for an existing stack, you can use the GetTemplate action.


   For more information about creating an update template, updating a stack, and monitoring the progress of the
   update, see Updating a
   Stack.

  request - `com.amazonaws.services.cloudformation.model.UpdateStackRequest`

  returns: Result of the UpdateStack operation returned by the service. - `com.amazonaws.services.cloudformation.model.UpdateStackResult`

  throws: com.amazonaws.services.cloudformation.model.InsufficientCapabilitiesException - The template contains resources with capabilities that weren't specified in the Capabilities parameter."
  (^com.amazonaws.services.cloudformation.model.UpdateStackResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.UpdateStackRequest request]
    (-> this (.updateStack request))))

(defn create-stack-set
  "Creates a stack set.

  request - `com.amazonaws.services.cloudformation.model.CreateStackSetRequest`

  returns: Result of the CreateStackSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.CreateStackSetResult`

  throws: com.amazonaws.services.cloudformation.model.NameAlreadyExistsException - The specified name is already in use."
  (^com.amazonaws.services.cloudformation.model.CreateStackSetResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.CreateStackSetRequest request]
    (-> this (.createStackSet request))))

(defn execute-change-set
  "Updates a stack using the input information that was provided when the specified change set was created. After
   the call successfully completes, AWS CloudFormation starts updating the stack. Use the DescribeStacks
   action to view the status of the update.


   When you execute a change set, AWS CloudFormation deletes all other change sets associated with the stack because
   they aren't valid for the updated stack.


   If a stack policy is associated with the stack, AWS CloudFormation enforces the policy during the update. You
   can't specify a temporary stack policy that overrides the current policy.

  request - `com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest`

  returns: Result of the ExecuteChangeSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.ExecuteChangeSetResult`

  throws: com.amazonaws.services.cloudformation.model.InvalidChangeSetStatusException - The specified change set can't be used to update the stack. For example, the change set status might be CREATE_IN_PROGRESS, or the stack status might be UPDATE_IN_PROGRESS."
  (^com.amazonaws.services.cloudformation.model.ExecuteChangeSetResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest request]
    (-> this (.executeChangeSet request))))

(defn delete-stack-instances
  "Deletes stack instances for the specified accounts, in the specified regions.

  request - `com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest`

  returns: Result of the DeleteStackInstances operation returned by the service. - `com.amazonaws.services.cloudformation.model.DeleteStackInstancesResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.DeleteStackInstancesResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest request]
    (-> this (.deleteStackInstances request))))

(defn update-termination-protection
  "Updates termination protection for the specified stack. If a user attempts to delete a stack with termination
   protection enabled, the operation fails and the stack remains unchanged. For more information, see Protecting a Stack From Being Deleted
   in the AWS CloudFormation User Guide.


   For nested stacks, termination
   protection is set on the root stack and cannot be changed directly on the nested stack.

  request - `com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest`

  returns: Result of the UpdateTerminationProtection operation returned by the service. - `com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionResult`"
  (^com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest request]
    (-> this (.updateTerminationProtection request))))

(defn list-stack-set-operations
  "Returns summary information about operations performed on a stack set.

  request - `com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest`

  returns: Result of the ListStackSetOperations operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStackSetOperationsResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.ListStackSetOperationsResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest request]
    (-> this (.listStackSetOperations request))))

(defn list-stack-instances
  "Returns summary information about stack instances that are associated with the specified stack set. You can
   filter for stack instances that are associated with a specific AWS account name or region.

  request - `com.amazonaws.services.cloudformation.model.ListStackInstancesRequest`

  returns: Result of the ListStackInstances operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStackInstancesResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.ListStackInstancesResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.ListStackInstancesRequest request]
    (-> this (.listStackInstances request))))

(defn list-imports
  "Lists all stacks that are importing an exported output value. To modify or remove an exported output value, first
   use this action to see which stacks are using it. To see the exported output values in your account, see
   ListExports.


   For more information about importing an exported output value, see the
   Fn::ImportValue  function.

  request - `com.amazonaws.services.cloudformation.model.ListImportsRequest`

  returns: Result of the ListImports operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListImportsResult`"
  (^com.amazonaws.services.cloudformation.model.ListImportsResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.ListImportsRequest request]
    (-> this (.listImports request))))

(defn delete-change-set
  "Deletes the specified change set. Deleting change sets ensures that no one executes the wrong change set.


   If the call successfully completes, AWS CloudFormation successfully deleted the change set.

  request - `com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest`

  returns: Result of the DeleteChangeSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.DeleteChangeSetResult`

  throws: com.amazonaws.services.cloudformation.model.InvalidChangeSetStatusException - The specified change set can't be used to update the stack. For example, the change set status might be CREATE_IN_PROGRESS, or the stack status might be UPDATE_IN_PROGRESS."
  (^com.amazonaws.services.cloudformation.model.DeleteChangeSetResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest request]
    (-> this (.deleteChangeSet request))))

(defn signal-resource
  "Sends a signal to the specified resource with a success or failure status. You can use the SignalResource API in
   conjunction with a creation policy or update policy. AWS CloudFormation doesn't proceed with a stack creation or
   update until resources receive the required number of signals or the timeout period is exceeded. The
   SignalResource API is useful in cases where you want to send signals from anywhere other than an Amazon EC2
   instance.

  request - `com.amazonaws.services.cloudformation.model.SignalResourceRequest`

  returns: Result of the SignalResource operation returned by the service. - `com.amazonaws.services.cloudformation.model.SignalResourceResult`"
  (^com.amazonaws.services.cloudformation.model.SignalResourceResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.SignalResourceRequest request]
    (-> this (.signalResource request))))

(defn set-stack-policy
  "Sets a stack policy for a specified stack.

  request - `com.amazonaws.services.cloudformation.model.SetStackPolicyRequest`

  returns: Result of the SetStackPolicy operation returned by the service. - `com.amazonaws.services.cloudformation.model.SetStackPolicyResult`"
  (^com.amazonaws.services.cloudformation.model.SetStackPolicyResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.SetStackPolicyRequest request]
    (-> this (.setStackPolicy request))))

(defn list-stack-resources
  "Returns descriptions of all resources of the specified stack.


   For deleted stacks, ListStackResources returns resource information for up to 90 days after the stack has been
   deleted.

  request - `com.amazonaws.services.cloudformation.model.ListStackResourcesRequest`

  returns: Result of the ListStackResources operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStackResourcesResult`"
  (^com.amazonaws.services.cloudformation.model.ListStackResourcesResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.ListStackResourcesRequest request]
    (-> this (.listStackResources request))))

(defn create-stack-instances
  "Creates stack instances for the specified accounts, within the specified regions. A stack instance refers to a
   stack in a specific account and region. Accounts and Regions are required
   parameters—you must specify at least one account and one region.

  request - `com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest`

  returns: Result of the CreateStackInstances operation returned by the service. - `com.amazonaws.services.cloudformation.model.CreateStackInstancesResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.CreateStackInstancesResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest request]
    (-> this (.createStackInstances request))))

(defn create-stack
  "Creates a stack as specified in the template. After the call completes successfully, the stack creation starts.
   You can check the status of the stack via the DescribeStacks API.

  request - `com.amazonaws.services.cloudformation.model.CreateStackRequest`

  returns: Result of the CreateStack operation returned by the service. - `com.amazonaws.services.cloudformation.model.CreateStackResult`

  throws: com.amazonaws.services.cloudformation.model.LimitExceededException - The quota for the resource has already been reached. For information on resource and stack limitations, see Limits in the AWS CloudFormation User Guide."
  (^com.amazonaws.services.cloudformation.model.CreateStackResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.CreateStackRequest request]
    (-> this (.createStack request))))

(defn list-stacks
  "Returns the summary information for stacks whose status matches the specified StackStatusFilter. Summary
   information for stacks that have been deleted is kept for 90 days after the stack is deleted. If no
   StackStatusFilter is specified, summary information for all stacks is returned (including existing stacks and
   stacks that have been deleted).

  request - `com.amazonaws.services.cloudformation.model.ListStacksRequest`

  returns: Result of the ListStacks operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStacksResult`"
  (^com.amazonaws.services.cloudformation.model.ListStacksResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.ListStacksRequest request]
    (-> this (.listStacks request)))
  (^com.amazonaws.services.cloudformation.model.ListStacksResult [^AmazonCloudFormationClient this]
    (-> this (.listStacks))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonCloudFormationClient this]
    (-> this (.shutdown))))

(defn describe-stack-resource-drifts
  "Returns drift information for the resources that have been checked for drift in the specified stack. This
   includes actual and expected configuration values for resources where AWS CloudFormation detects configuration
   drift.


   For a given stack, there will be one StackResourceDrift for each stack resource that has been
   checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not
   currently support drift detection are not checked, and so not included. For a list of resources that support
   drift detection, see Resources that Support Drift Detection.


   Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to detect
   drift on all supported resources for a given stack.

  request - `com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsRequest`

  returns: Result of the DescribeStackResourceDrifts operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsRequest request]
    (-> this (.describeStackResourceDrifts request))))

(defn list-change-sets
  "Returns the ID and status of each active change set for a stack. For example, AWS CloudFormation lists change
   sets that are in the CREATE_IN_PROGRESS or CREATE_PENDING state.

  request - `com.amazonaws.services.cloudformation.model.ListChangeSetsRequest`

  returns: Result of the ListChangeSets operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListChangeSetsResult`"
  (^com.amazonaws.services.cloudformation.model.ListChangeSetsResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.ListChangeSetsRequest request]
    (-> this (.listChangeSets request))))

(defn describe-account-limits
  "Retrieves your account's AWS CloudFormation limits, such as the maximum number of stacks that you can create in
   your account. For more information about account limits, see AWS
   CloudFormation Limits in the AWS CloudFormation User Guide.

  request - `com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest`

  returns: Result of the DescribeAccountLimits operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeAccountLimitsResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeAccountLimitsResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest request]
    (-> this (.describeAccountLimits request))))

(defn stop-stack-set-operation
  "Stops an in-progress operation on a stack set and its associated stack instances.

  request - `com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest`

  returns: Result of the StopStackSetOperation operation returned by the service. - `com.amazonaws.services.cloudformation.model.StopStackSetOperationResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.StopStackSetOperationResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest request]
    (-> this (.stopStackSetOperation request))))

(defn delete-stack
  "Deletes a specified stack. Once the call completes successfully, stack deletion starts. Deleted stacks do not
   show up in the DescribeStacks API if the deletion has been completed successfully.

  request - `com.amazonaws.services.cloudformation.model.DeleteStackRequest`

  returns: Result of the DeleteStack operation returned by the service. - `com.amazonaws.services.cloudformation.model.DeleteStackResult`

  throws: com.amazonaws.services.cloudformation.model.TokenAlreadyExistsException - A client request token already exists."
  (^com.amazonaws.services.cloudformation.model.DeleteStackResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DeleteStackRequest request]
    (-> this (.deleteStack request))))

(defn get-template
  "Returns the template body for a specified stack. You can get the template for running or deleted stacks.


   For deleted stacks, GetTemplate returns the template for up to 90 days after the stack has been deleted.



   If the template does not exist, a ValidationError is returned.

  request - `com.amazonaws.services.cloudformation.model.GetTemplateRequest`

  returns: Result of the GetTemplate operation returned by the service. - `com.amazonaws.services.cloudformation.model.GetTemplateResult`

  throws: com.amazonaws.services.cloudformation.model.ChangeSetNotFoundException - The specified change set name or ID doesn't exit. To view valid change sets for a stack, use the ListChangeSets action."
  (^com.amazonaws.services.cloudformation.model.GetTemplateResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.GetTemplateRequest request]
    (-> this (.getTemplate request))))

(defn describe-stack-resources
  "Returns AWS resource descriptions for running and deleted stacks. If StackName is specified, all the
   associated resources that are part of the stack are returned. If PhysicalResourceId is specified,
   the associated resources of the stack that the resource belongs to are returned.



   Only the first 100 resources will be returned. If your stack has more resources than this, you should use
   ListStackResources instead.



   For deleted stacks, DescribeStackResources returns resource information for up to 90 days after the
   stack has been deleted.


   You must specify either StackName or PhysicalResourceId, but not both. In addition, you
   can specify LogicalResourceId to filter the returned result. For more information about resources,
   the LogicalResourceId and PhysicalResourceId, go to the AWS CloudFormation User Guide.



   A ValidationError is returned if you specify both StackName and
   PhysicalResourceId in the same request.

  request - `com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest`

  returns: Result of the DescribeStackResources operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackResourcesResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackResourcesResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest request]
    (-> this (.describeStackResources request))))

(defn describe-stack-set-operation
  "Returns the description of the specified stack set operation.

  request - `com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest`

  returns: Result of the DescribeStackSetOperation operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackSetOperationResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.DescribeStackSetOperationResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest request]
    (-> this (.describeStackSetOperation request))))

(defn list-stack-set-operation-results
  "Returns summary information about the results of a stack set operation.

  request - `com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest`

  returns: Result of the ListStackSetOperationResults operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest request]
    (-> this (.listStackSetOperationResults request))))

(defn describe-stack-events
  "Returns all stack related events for a specified stack in reverse chronological order. For more information about
   a stack's event history, go to Stacks in the AWS
   CloudFormation User Guide.



   You can list events for stacks that have failed to create or have been deleted by specifying the unique stack
   identifier (stack ID).

  request - `com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest`

  returns: Result of the DescribeStackEvents operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackEventsResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackEventsResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest request]
    (-> this (.describeStackEvents request))))

(defn estimate-template-cost
  "Returns the estimated monthly cost of a template. The return value is an AWS Simple Monthly Calculator URL with a
   query string that describes the resources required to run the template.

  request - `com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest`

  returns: Result of the EstimateTemplateCost operation returned by the service. - `com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult`"
  (^com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest request]
    (-> this (.estimateTemplateCost request)))
  (^com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult [^AmazonCloudFormationClient this]
    (-> this (.estimateTemplateCost))))

(defn describe-stack-set
  "Returns the description of the specified stack set.

  request - `com.amazonaws.services.cloudformation.model.DescribeStackSetRequest`

  returns: Result of the DescribeStackSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackSetResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.DescribeStackSetResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DescribeStackSetRequest request]
    (-> this (.describeStackSet request))))

(defn continue-update-rollback
  "For a specified stack that is in the UPDATE_ROLLBACK_FAILED state, continues rolling it back to the
   UPDATE_ROLLBACK_COMPLETE state. Depending on the cause of the failure, you can manually  fix the error and continue the rollback. By continuing the rollback, you can return your stack to a working
   state (the UPDATE_ROLLBACK_COMPLETE state), and then try to update the stack again.


   A stack goes into the UPDATE_ROLLBACK_FAILED state when AWS CloudFormation cannot roll back all
   changes after a failed stack update. For example, you might have a stack that is rolling back to an old database
   instance that was deleted outside of AWS CloudFormation. Because AWS CloudFormation doesn't know the database was
   deleted, it assumes that the database instance still exists and attempts to roll back to it, causing the update
   rollback to fail.

  request - `com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest`

  returns: Result of the ContinueUpdateRollback operation returned by the service. - `com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackResult`

  throws: com.amazonaws.services.cloudformation.model.TokenAlreadyExistsException - A client request token already exists."
  (^com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest request]
    (-> this (.continueUpdateRollback request))))

(defn get-template-summary
  "Returns information about a new or existing template. The GetTemplateSummary action is useful for
   viewing parameter information, such as default parameter values and parameter types, before you create or update
   a stack or stack set.


   You can use the GetTemplateSummary action when you submit a template, or you can get template
   information for a stack set, or a running or deleted stack.


   For deleted stacks, GetTemplateSummary returns the template information for up to 90 days after the
   stack has been deleted. If the template does not exist, a ValidationError is returned.

  request - `com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest`

  returns: Result of the GetTemplateSummary operation returned by the service. - `com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest request]
    (-> this (.getTemplateSummary request)))
  (^com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult [^AmazonCloudFormationClient this]
    (-> this (.getTemplateSummary))))

(defn list-exports
  "Lists all exported output values in the account and region in which you call this action. Use this action to see
   the exported output values that you can import into other stacks. To import values, use the
   Fn::ImportValue  function.


   For more information, see  AWS
   CloudFormation Export Stack Output Values.

  request - `com.amazonaws.services.cloudformation.model.ListExportsRequest`

  returns: Result of the ListExports operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListExportsResult`"
  (^com.amazonaws.services.cloudformation.model.ListExportsResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.ListExportsRequest request]
    (-> this (.listExports request))))

(defn cancel-update-stack
  "Cancels an update on the specified stack. If the call completes successfully, the stack rolls back the update and
   reverts to the previous stack configuration.



   You can cancel only stacks that are in the UPDATE_IN_PROGRESS state.

  request - `com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest`

  returns: Result of the CancelUpdateStack operation returned by the service. - `com.amazonaws.services.cloudformation.model.CancelUpdateStackResult`

  throws: com.amazonaws.services.cloudformation.model.TokenAlreadyExistsException - A client request token already exists."
  (^com.amazonaws.services.cloudformation.model.CancelUpdateStackResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest request]
    (-> this (.cancelUpdateStack request))))

(defn update-stack-set
  "Updates the stack set, and associated stack instances in the specified accounts and regions.


   Even if the stack set operation created by updating the stack set fails (completely or partially, below or above
   a specified failure tolerance), the stack set is updated with your changes. Subsequent
   CreateStackInstances calls on the specified stack set use the updated stack set.

  request - `com.amazonaws.services.cloudformation.model.UpdateStackSetRequest`

  returns: Result of the UpdateStackSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.UpdateStackSetResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.UpdateStackSetResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.UpdateStackSetRequest request]
    (-> this (.updateStackSet request))))

(defn describe-change-set
  "Returns the inputs for the change set and a list of changes that AWS CloudFormation will make if you execute the
   change set. For more information, see Updating Stacks Using Change Sets in the AWS CloudFormation User Guide.

  request - `com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest`

  returns: Result of the DescribeChangeSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeChangeSetResult`

  throws: com.amazonaws.services.cloudformation.model.ChangeSetNotFoundException - The specified change set name or ID doesn't exit. To view valid change sets for a stack, use the ListChangeSets action."
  (^com.amazonaws.services.cloudformation.model.DescribeChangeSetResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest request]
    (-> this (.describeChangeSet request))))

(defn list-stack-sets
  "Returns summary information about stack sets that are associated with the user.

  request - `com.amazonaws.services.cloudformation.model.ListStackSetsRequest`

  returns: Result of the ListStackSets operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStackSetsResult`"
  (^com.amazonaws.services.cloudformation.model.ListStackSetsResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.ListStackSetsRequest request]
    (-> this (.listStackSets request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonCloudFormationClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-change-set
  "Creates a list of changes that will be applied to a stack so that you can review the changes before executing
   them. You can create a change set for a stack that doesn't exist or an existing stack. If you create a change set
   for a stack that doesn't exist, the change set shows all of the resources that AWS CloudFormation will create. If
   you create a change set for an existing stack, AWS CloudFormation compares the stack's information with the
   information that you submit in the change set and lists the differences. Use change sets to understand which
   resources AWS CloudFormation will create or change, and how it will change resources in an existing stack, before
   you create or update a stack.


   To create a change set for a stack that doesn't exist, for the ChangeSetType parameter, specify
   CREATE. To create a change set for an existing stack, specify UPDATE for the
   ChangeSetType parameter. After the CreateChangeSet call successfully completes, AWS
   CloudFormation starts creating the change set. To check the status of the change set or to review it, use the
   DescribeChangeSet action.


   When you are satisfied with the changes the change set will make, execute the change set by using the
   ExecuteChangeSet action. AWS CloudFormation doesn't make changes until you execute the change set.

  request - `com.amazonaws.services.cloudformation.model.CreateChangeSetRequest`

  returns: Result of the CreateChangeSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.CreateChangeSetResult`

  throws: com.amazonaws.services.cloudformation.model.AlreadyExistsException - The resource with the name requested already exists."
  (^com.amazonaws.services.cloudformation.model.CreateChangeSetResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.CreateChangeSetRequest request]
    (-> this (.createChangeSet request))))

(defn describe-stack-instance
  "Returns the stack instance that's associated with the specified stack set, AWS account, and region.


   For a list of stack instances that are associated with a specific stack set, use ListStackInstances.

  request - `com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest`

  returns: Result of the DescribeStackInstance operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackInstanceResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.DescribeStackInstanceResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest request]
    (-> this (.describeStackInstance request))))

(defn delete-stack-set
  "Deletes a stack set. Before you can delete a stack set, all of its member stack instances must be deleted. For
   more information about how to do this, see DeleteStackInstances.

  request - `com.amazonaws.services.cloudformation.model.DeleteStackSetRequest`

  returns: Result of the DeleteStackSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.DeleteStackSetResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotEmptyException - You can't yet delete this stack set, because it still contains one or more stack instances. Delete all stack instances from the stack set before deleting the stack set."
  (^com.amazonaws.services.cloudformation.model.DeleteStackSetResult [^AmazonCloudFormationClient this ^com.amazonaws.services.cloudformation.model.DeleteStackSetRequest request]
    (-> this (.deleteStackSet request))))

