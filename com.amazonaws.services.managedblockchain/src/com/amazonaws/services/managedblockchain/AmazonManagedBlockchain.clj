(ns com.amazonaws.services.managedblockchain.AmazonManagedBlockchain
  "Interface for accessing ManagedBlockchain.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonManagedBlockchain instead.




  Amazon Managed Blockchain is a fully managed service for creating and managing blockchain networks using open source
  frameworks. Blockchain allows you to build applications where multiple parties can securely and transparently run
  transactions and share data without the need for a trusted, central authority. Currently, Managed Blockchain supports
  the Hyperledger Fabric open source framework."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.managedblockchain AmazonManagedBlockchain]))

(defn create-network
  "Creates a new blockchain network using Amazon Managed Blockchain.

  create-network-request - `com.amazonaws.services.managedblockchain.model.CreateNetworkRequest`

  returns: Result of the CreateNetwork operation returned by the service. - `com.amazonaws.services.managedblockchain.model.CreateNetworkResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.CreateNetworkResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.CreateNetworkRequest create-network-request]
    (-> this (.createNetwork create-network-request))))

(defn list-networks
  "Returns information about the networks in which the current AWS account has members.

  list-networks-request - `com.amazonaws.services.managedblockchain.model.ListNetworksRequest`

  returns: Result of the ListNetworks operation returned by the service. - `com.amazonaws.services.managedblockchain.model.ListNetworksResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.ListNetworksResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.ListNetworksRequest list-networks-request]
    (-> this (.listNetworks list-networks-request))))

(defn create-proposal
  "Creates a proposal for a change to the network that other members of the network can vote on, for example, a
   proposal to add a new member to the network. Any member can create a proposal.

  create-proposal-request - `com.amazonaws.services.managedblockchain.model.CreateProposalRequest`

  returns: Result of the CreateProposal operation returned by the service. - `com.amazonaws.services.managedblockchain.model.CreateProposalResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.CreateProposalResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.CreateProposalRequest create-proposal-request]
    (-> this (.createProposal create-proposal-request))))

(defn delete-node
  "Deletes a peer node from a member that your AWS account owns. All data on the node is lost and cannot be
   recovered.

  delete-node-request - `com.amazonaws.services.managedblockchain.model.DeleteNodeRequest`

  returns: Result of the DeleteNode operation returned by the service. - `com.amazonaws.services.managedblockchain.model.DeleteNodeResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.DeleteNodeResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.DeleteNodeRequest delete-node-request]
    (-> this (.deleteNode delete-node-request))))

(defn get-node
  "Returns detailed information about a peer node.

  get-node-request - `com.amazonaws.services.managedblockchain.model.GetNodeRequest`

  returns: Result of the GetNode operation returned by the service. - `com.amazonaws.services.managedblockchain.model.GetNodeResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.GetNodeResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.GetNodeRequest get-node-request]
    (-> this (.getNode get-node-request))))

(defn list-proposal-votes
  "Returns the listing of votes for a specified proposal, including the value of each vote and the unique identifier
   of the member that cast the vote.

  list-proposal-votes-request - `com.amazonaws.services.managedblockchain.model.ListProposalVotesRequest`

  returns: Result of the ListProposalVotes operation returned by the service. - `com.amazonaws.services.managedblockchain.model.ListProposalVotesResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.ListProposalVotesResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.ListProposalVotesRequest list-proposal-votes-request]
    (-> this (.listProposalVotes list-proposal-votes-request))))

(defn list-nodes
  "Returns information about the nodes within a network.

  list-nodes-request - `com.amazonaws.services.managedblockchain.model.ListNodesRequest`

  returns: Result of the ListNodes operation returned by the service. - `com.amazonaws.services.managedblockchain.model.ListNodesResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.ListNodesResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.ListNodesRequest list-nodes-request]
    (-> this (.listNodes list-nodes-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonManagedBlockchain this]
    (-> this (.shutdown))))

(defn list-proposals
  "Returns a listing of proposals for the network.

  list-proposals-request - `com.amazonaws.services.managedblockchain.model.ListProposalsRequest`

  returns: Result of the ListProposals operation returned by the service. - `com.amazonaws.services.managedblockchain.model.ListProposalsResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.ListProposalsResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.ListProposalsRequest list-proposals-request]
    (-> this (.listProposals list-proposals-request))))

(defn reject-invitation
  "Rejects an invitation to join a network. This action can be called by a principal in an AWS account that has
   received an invitation to create a member and join a network.

  reject-invitation-request - `com.amazonaws.services.managedblockchain.model.RejectInvitationRequest`

  returns: Result of the RejectInvitation operation returned by the service. - `com.amazonaws.services.managedblockchain.model.RejectInvitationResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.RejectInvitationResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.RejectInvitationRequest reject-invitation-request]
    (-> this (.rejectInvitation reject-invitation-request))))

(defn create-member
  "Creates a member within a Managed Blockchain network.

  create-member-request - `com.amazonaws.services.managedblockchain.model.CreateMemberRequest`

  returns: Result of the CreateMember operation returned by the service. - `com.amazonaws.services.managedblockchain.model.CreateMemberResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.CreateMemberResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.CreateMemberRequest create-member-request]
    (-> this (.createMember create-member-request))))

(defn list-members
  "Returns a listing of the members in a network and properties of their configurations.

  list-members-request - `com.amazonaws.services.managedblockchain.model.ListMembersRequest`

  returns: Result of the ListMembers operation returned by the service. - `com.amazonaws.services.managedblockchain.model.ListMembersResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.ListMembersResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.ListMembersRequest list-members-request]
    (-> this (.listMembers list-members-request))))

(defn create-node
  "Creates a peer node in a member.

  create-node-request - `com.amazonaws.services.managedblockchain.model.CreateNodeRequest`

  returns: Result of the CreateNode operation returned by the service. - `com.amazonaws.services.managedblockchain.model.CreateNodeResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.CreateNodeResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.CreateNodeRequest create-node-request]
    (-> this (.createNode create-node-request))))

(defn delete-member
  "Deletes a member. Deleting a member removes the member and all associated resources from the network.
   DeleteMember can only be called for a specified MemberId if the principal performing
   the action is associated with the AWS account that owns the member. In all other cases, the
   DeleteMember action is carried out as the result of an approved proposal to remove a member. If
   MemberId is the last member in a network specified by the last AWS account, the network is deleted
   also.

  delete-member-request - `com.amazonaws.services.managedblockchain.model.DeleteMemberRequest`

  returns: Result of the DeleteMember operation returned by the service. - `com.amazonaws.services.managedblockchain.model.DeleteMemberResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.DeleteMemberResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.DeleteMemberRequest delete-member-request]
    (-> this (.deleteMember delete-member-request))))

(defn vote-on-proposal
  "Casts a vote for a specified ProposalId on behalf of a member. The member to vote as, specified by
   VoterMemberId, must be in the same AWS account as the principal that calls the action.

  vote-on-proposal-request - `com.amazonaws.services.managedblockchain.model.VoteOnProposalRequest`

  returns: Result of the VoteOnProposal operation returned by the service. - `com.amazonaws.services.managedblockchain.model.VoteOnProposalResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.VoteOnProposalResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.VoteOnProposalRequest vote-on-proposal-request]
    (-> this (.voteOnProposal vote-on-proposal-request))))

(defn get-network
  "Returns detailed information about a network.

  get-network-request - `com.amazonaws.services.managedblockchain.model.GetNetworkRequest`

  returns: Result of the GetNetwork operation returned by the service. - `com.amazonaws.services.managedblockchain.model.GetNetworkResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.GetNetworkResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.GetNetworkRequest get-network-request]
    (-> this (.getNetwork get-network-request))))

(defn get-proposal
  "Returns detailed information about a proposal.

  get-proposal-request - `com.amazonaws.services.managedblockchain.model.GetProposalRequest`

  returns: Result of the GetProposal operation returned by the service. - `com.amazonaws.services.managedblockchain.model.GetProposalResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.GetProposalResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.GetProposalRequest get-proposal-request]
    (-> this (.getProposal get-proposal-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonManagedBlockchain this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-invitations
  "Returns a listing of all invitations made on the specified network.

  list-invitations-request - `com.amazonaws.services.managedblockchain.model.ListInvitationsRequest`

  returns: Result of the ListInvitations operation returned by the service. - `com.amazonaws.services.managedblockchain.model.ListInvitationsResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.ListInvitationsResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.ListInvitationsRequest list-invitations-request]
    (-> this (.listInvitations list-invitations-request))))

(defn get-member
  "Returns detailed information about a member.

  get-member-request - `com.amazonaws.services.managedblockchain.model.GetMemberRequest`

  returns: Result of the GetMember operation returned by the service. - `com.amazonaws.services.managedblockchain.model.GetMemberResult`

  throws: com.amazonaws.services.managedblockchain.model.InvalidRequestException - The action or operation requested is invalid. Verify that the action is typed correctly."
  (^com.amazonaws.services.managedblockchain.model.GetMemberResult [^AmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.GetMemberRequest get-member-request]
    (-> this (.getMember get-member-request))))

