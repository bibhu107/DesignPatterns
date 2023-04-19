from solana.account import Account
from solana.publickey import PublicKey
from solana.rpc.api import Client
from solana.transaction import Transaction, AccountMeta, TransactionInstruction

# Initialize Solana client
client = Client("https://api.devnet.solana.com")

# Create a new account to hold the contract
contract_account = Account()

# Define the program data for the contract
program_data = bytes.fromhex("077a656e6f6f6d")

# Create a new transaction instruction to deploy the contract
instruction = TransactionInstruction(
    keys=[AccountMeta(pubkey=contract_account.public_key(), is_signer=True, is_writable=True)],
    program_id=PublicKey("11111111111111111111111111111111"),
    data=program_data,
)

# Create a new transaction and send it to Solana
transaction = Transaction().add(instruction)
transaction.recent_blockhash = client.get_recent_blockhash()["result"]
transaction.sign([contract_account])
result = client.send_transaction(transaction)

print(f"Contract deployed with address {contract_account.public_key()}")
